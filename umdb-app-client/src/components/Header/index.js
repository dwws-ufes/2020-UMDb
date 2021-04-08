import React from 'react';
import { Link } from 'react-router-dom';

import './Header.css';


const Header = () => {
    return (
        <div className="ui secondary pointing menu">
            <Link to="/" className="item">UMDb</Link>
            <div className="right menu">
                <Link to="/signin" className="item">Sign In</Link>
                <Link to="/admin" className="item">Página Administrativa</Link>
            </div>
        </div>
    );
}

export default Header;