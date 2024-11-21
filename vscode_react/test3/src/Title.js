
function Title({title, text}){
    // console.log("props===");
    // console.log(props);

    return (
        <>
            <h2 className="title">{title}</h2>
            <p>{text}</p>
        </>
    );
}
export default Title;