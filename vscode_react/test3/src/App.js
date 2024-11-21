
import './App.css';
import Title from './Title';
import { useState } from 'react';

function App() {
  const [title, setTitle] = useState("Hello World!!");
  const [text, setText] = useState("");
  
  const ClickHandler =()=>{
    setTitle("Good Morning World");
    // setTitle(oldState => oldState + "plus");
  }
  const changeHanlder =(e)=>{
    // console.log(e.target.value);
    setText(e.target.value);
  }
  const onReset =()=>{
    setText('');
  }

  return (
    <div className="wrapper">
      <Title title={title} text={text}/>
      <input type="text" value={text} onChange={changeHanlder}></input>
      <button onClick={onReset}>초기화</button>
      <button onClick={ClickHandler}>change Title</button>
      {/* <div>
        <b>값 : {text}</b>
      </div> */}
    </div>
  );
}

export default App;
