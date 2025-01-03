import './App.css';
import React, { useRef, useState } from 'react';
import Editor from './components/Editor';
import Header from './components/Header';
import List from './components/List';

// 목업데이터
const mockData = [
  {
    id:0,
    isDone: false,
    content: "React 공부하기",
    date: new Date().getTime(),
  },
  {
    id:1,
    isDone: false,
    content: "빨래하기",
    date: new Date().getTime(),
  },
  {
    id:2,
    isDone: false,
    content: "설거지하기",
    date: new Date().getTime(),
  }
];

function App() {
  const[todos, setTodos] = useState(mockData);
  const idRef = useRef(3); //초기번호는 mockData 0,1,2가 이미 있으므로 3번부터 시작.

  const onCreate = (content) => {
    const newTodo = {
      id : idRef.current++,
      isDone : false,
      content : content,
      date : new Date().getTime(),
    }
    setTodos([newTodo, ...todos]);

  }

  return (
    <div className='App'>
      <Header/>
      <Editor onCreate={onCreate}/>
      {/* onCreate함수를 props로 전달할 수 있도록 */}
      <List todos={todos}/>
    </div>
  );
}

export default App;
