import React from 'react';
import './TodoItem.css';

function TodoItem({id, isDone, content, date}) {
  //List로부터 네가지 값을 props로 전달 받는다.
  return (
    <div className='TodoItem'>
        <input type="checkbox" readOnly checked={isDone}/>
        <div className='content'>{content}</div>
        <div className='date'>{new Date(date).toLocaleDateString()}</div>
        <button>삭제</button>
    </div>
  )
}

export default TodoItem;