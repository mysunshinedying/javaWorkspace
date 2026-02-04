package ch11.sec05;

//sub 클래스에서 super 클래스의 타입 패라미터를 표기
//sub 클래스에서 결정되지 않은 타입이 있다면 추가 가능
public class ChildProduct<T,M,C> extends  Product<T,M> {
    private C company;

    public C getCompany(){
        return company;
    }

    public void setCompany(C company){
        this.company = company;
    }
}
