import { useState } from "react";

function Titulo({ escola, paragrafo, cor }){

    let meuNome = 'Isaac';
    const url = "https://i.imgur.com/uWteCty.gif";

    var [texto, setTexto] = useState("estou normal");
    let [inputText, setInputText] = useState("");

    function Clicou(){
        setTexto(inputText);
    }

    return (
        <div>
            <h1 style={{ color: cor }}> Oi eu sou { meuNome } da {escola ? escola : 'escola desconhecida' }</h1>

            {/* No Width, poderia ser usado como se fosse HTML normalmente */}
            <img src={ url } alt="react" width={ 100 } height='100px'/>

            { 
                paragrafo ? 

                <p> 
                    Escola com rotina muito puxada
                </p>

                : 

                <p>
                    Sem nada à respeito da escola
                </p>
            }


            <span> { texto } </span>
            <input type="text" value={ inputText } onChange={(e) => {setInputText(e.target.value)}}/>
            <button onClick={ Clicou }> Click me </button>
        </div>
    );
};


export default Titulo;