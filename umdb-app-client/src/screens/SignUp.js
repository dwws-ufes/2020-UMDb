import React from 'react';
import { Link } from 'react-router-dom';

const SignUp = () => {
    return (
        <div class="page-login">
            <div class="ui centered grid container">
                <div class="eight wide column">
                    {/* <div class="ui icon warning message">
                        <i class="lock icon"></i>
                        <div class="content">
                            <div class="header">
                                Oops, algo deu errado!
                            </div>
                            <p>Verifique seu usuário, senha e tente novamente!</p>
                        </div>
                    </div> */}
                    <div class="ui fluid card">
                        <div class="content">
                            <form class="ui form" method="POST">
                                <div class="field">
                                    <label>Nome</label>
                                    <input type="text" name="name" placeholder="Nome" />
                                </div>
                                <div class="field">
                                    <label>E-mail</label>
                                    <input type="email" name="email" placeholder="E-mail" />
                                </div>
                                <div class="field">
                                    <label>Senha</label>
                                    <input type="password" name="password1" placeholder="Senha" />
                                </div>
                                <div class="field">
                                    <label>Confirmar senha</label>
                                    <input type="password" name="password2" placeholder="Confirmar senha" />
                                </div>
                                <div style={{ display: 'flex', alignItems: 'center'}}>
                                    <button class="ui labeled icon button" type="submit" style={{ marginRight: '10px' }}>
                                        <i class="unlock alternate icon"></i>
                                        Cadastrar
                                    </button>
                                    <div className="link-cadastro">
                                        Já tem uma conta? <Link to='/signin'>Faça login</Link>
                                    </div>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    );
};

export default SignUp;