import ProductCard from "./ProductCard";

function ProductList(){
    const dummyProducts = [
        {
            productName: "무선 이어폰",
            price: 159000,
            description: "최신 블루투스 기술로 제작된 고품질 이어폰",
            inStock: true,
        },
        {
            productName: "게이밍 마우스",
            price: 75000,
            description: "정밀한 컨트롤을 위한 고성능 마우스",
            inStock: false,
        },
        {
            productName: "스마트 워치",
            price: 210000,
            description: "운동 추적과 알림 확인이 가능한 스마트 워치",
            inStock: true,
        },
        {
            productName: "USB-C 허브",
            price: 45000,
            description: "다양한 포트를 제공하는 USB-C 확장 허브",
            inStock: true,
        },
        {
            productName: "휴대용 배터리",
            price: 38000,
            description: "고속 충전을 지원하는 10000mAh 보조 배터리",
            inStock: false,
        },
    ];
    return (
        <div>
            <h1>사용자 목록</h1>
           {dummyProducts.map((dummyProduct, index) =>(
            <ProductCard
                key={index}
                productName={dummyProduct.productName} 
                price={dummyProduct.price}
                description={dummyProduct.description}
                inStock={dummyProduct.inStock}
            />
           ))};
        </div>
    );
}
export default ProductList;