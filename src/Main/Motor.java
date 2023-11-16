package Main;

import com.sun.xml.internal.bind.v2.model.core.ID;

public class Motor {
//    Bài 3: Xây dựng ứng dụng quản lý xe máy (id, name, price, cc)
//- 1234 CRUD
//- 5 Tìm kiếm theo tên gần đúng
//- 6 Tìm kiếm theo khoảng giá
//- 7 Sắp xếp theo cc tăng dần
//- 8 Sắp xếp theo cc giảm dần
    private int id;
    private String name;
    private int price;
    private int cc;

    public Motor(int id, String name, int price, int cc) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.cc = cc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", cc=" + cc +
                '}';
    }
}
