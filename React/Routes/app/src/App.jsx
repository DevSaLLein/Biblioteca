// import { useState } from 'react'
// import reactLogo from './assets/react.svg'
// import viteLogo from '/vite.svg'
// import './App.css'

// function App() {
//   const [count, setCount] = useState(0)

//   return (
//     <>
//       <div>
//         <a href="https://vitejs.dev" target="_blank">
//           <img src={viteLogo} className="logo" alt="Vite logo" />
//         </a>
//         <a href="https://react.dev" target="_blank">
//           <img src={reactLogo} className="logo react" alt="React logo" />
//         </a>
//       </div>

//       <h1> Introdução ao REACT</h1>

//       <div className="card">
//         <button onClick={() => setCount((count) => count + 1)}>
//           count is {count}
//         </button>
//         <p>
//           Edit <code>src/App.jsx</code> and save to test HMR
//         </p>
//       </div>
      
//       <p className="read-the-docs">
//         Click on the Vite and React logos to learn more
//       </p>
//     </>
//   )
// }

// export default App


// Componente sempre com o mesmo nome do arquivo
// Sempre com letras maiúculas

import Titulo from './Titulo.jsx';

import { BrowserRouter, Routes, Route } from 'react-router-dom';

import Home from './pages/Home.jsx';
import Sobre from './pages/Sobre.jsx';
import Contato from './pages/Contato.jsx';

//Ao retornar dois valores, é necessário:
// Return com parênteses, e envolta de uma DIV

function App(){

  // escola = PROPS
  // PROPS: pode ser passado praticamente qualquer coisa => arrays, objetos e afins
  return (
    <div>

      <BrowserRouter>
        <Routes>
            <Route path='/' element={ <Home/> } ></Route>
            <Route path='/sobre' element={ <Sobre/> } ></Route>
            <Route path='/contato' element={ <Contato/> } ></Route>
        </Routes>
      </BrowserRouter>

      <Home/>

      <Titulo cor = 'green' escola="EEEP José de Barcelos" paragrafo = {false}/>
      <Titulo cor='blue' escola="EEEP Professor Onélio Porto" paragrafo = {true}/>
      <Titulo/>

    </div>
  );

}

export default App;