import React from 'react';
import "./TodoItem.css";
function TodoItem({id, isDone, content, date,onUpdate,onDelete}) {
	//List부터 네가지 값을 props로 전달 받는다. 구조분해할당
	const onChangeCheckbox = () => {
		onUpdate(id);
	  };
	  const onClickDeleteButton = ()=>{
		onDelete(id);
	  };

  return (
	<div className='TodoItem'>
	  <input type="checkbox" readOnly checked={isDone} onChange={onChangeCheckbox} />
	  <div className='content'>{content}</div>
	  <div className='date'>
		{new Date(date).toLocaleDateString()}
	  </div>
	  <button onClick={onClickDeleteButton}>삭제</button>
	</div>
  )
}

export default TodoItem
