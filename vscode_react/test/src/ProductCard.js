
function ProductCard(props){
    const cardStyle={
        backgroundColor : props.inStock ? 'lightgreen' : 'lightgray',
        padding: '10px',
        margin: '10px',
        borderRadius: '5px'
    }
    return(
        <div style={cardStyle}>
            <h2>상품명 : {props.productName}</h2>
            <p>상품가격: {props.price}</p>
            <p>상품설명: {props.description}</p>
            <p>재고상태: {props.inStock ? "있음" : "없음"}</p>
        </div>

    );

}
// 기본값 설정
ProductCard.defaultProps = {
    productName: "상품명 없음",
    price: "가격 정보 없음",
    description: "설명 없음",
    inStock: false,
};
export default ProductCard;