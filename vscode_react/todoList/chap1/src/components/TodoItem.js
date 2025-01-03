import React from 'react';
import './TodoItem.css';

function TodoItem() {
  return (
    <div className='TodoItem'>
        <input type="checkbox"/>
        <div className='content'>ToDo...</div>
        <div className='date'>Date</div>
        <button>삭제</button>
    </div>
  )
}

export default TodoItem;