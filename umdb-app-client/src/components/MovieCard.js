import React from 'react';
import { Card } from 'semantic-ui-react';

const MovieCard = ({ title, year, link, imageSource }) => {
    return (
        <Card style={{ marginBottom: '15px' }} href={link}>
            <img
                alt={title}
                style={{
                    height: '210px',
                    objectFit: 'cover',
                    objectPosition: 'top center'
                }}
                src={imageSource}
            />
            <Card.Content>
                <Card.Header>{title}</Card.Header>
                <Card.Meta>
                    <span className='date'>{year}</span>
                </Card.Meta>
            </Card.Content>
        </Card>
    );
}

export default MovieCard;