import React, { Component } from 'react';
import { connect } from 'react-redux';
import { editActor, fetchActor } from '../../actions/actor';
import { editDirector, fetchDirector } from '../../actions/director';
import { editGenre, fetchGenre } from '../../actions/genre';

import DefaultForm from '../../components/DefaultForm'
import AdminContainer from '../../components/AdminContainer'
import AdminInternalHeader from '../../components/AdminInternalHeader'

class EditDefault extends Component  {
    constructor(props) {
        super(props)
        const { headerTitle, activeItem } = this.props
        const entity = this.props[activeItem]
        this.state = {
            headerTitle,
            activeItem,
            name: entity ? entity.name : '',
            id: this.props.match.params.id,
            initialValue: ''
        }
    }

    componentDidMount() {
        if (this.state.activeItem === 'actor') {
            this.props.fetchActor(this.state.id)
        } else if (this.state.activeItem === 'director') {
            this.props.fetchDirector(this.state.id)
        } else if (this.state.activeItem === 'genre') {
            this.props.fetchGenre(this.state.id)
        }
    }

    onSubmit = (e) => {
        e.preventDefault()
        if (this.state.activeItem === 'actor') {
            this.props.editActor(this.state.id, {name: this.state.name});
        } else if (this.state.activeItem === 'director') {
            this.props.editDirector(this.state.id, {name: this.state.name});
        } else if (this.state.activeItem === 'genre') {
            this.props.editGenre(this.state.id, {name: this.state.name});
        }
    };

    handleChange = (value) => {
        this.setState({name: value});
    }

    render () {
        return (
            <AdminContainer activeItem={this.state.activeItem}>
                <AdminInternalHeader title={this.state.headerTitle} link="" />
                <DefaultForm buttonLabel="Editar" buttonIcon="write" initialValue={this.state.name} onSubmit={this.onSubmit} onInputChange={this.handleChange} />
            </AdminContainer>
        );   
    }
};

const mapStateToProps = (state, ownProps) => {
    return {
        genre: state.genres[ownProps.match.params.id],
        actor: state.actors[ownProps.match.params.id],
        director: state.directors[ownProps.match.params.id]
    };
};

export default connect(
    mapStateToProps,
    { editActor, fetchActor, fetchDirector, editDirector, editGenre, fetchGenre }
)(EditDefault);
  