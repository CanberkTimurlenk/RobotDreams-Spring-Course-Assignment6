Examples were created using 'CascadeType.REMOVE' and 'CascadeType.PERSIST' to demonstrate the impact of the cascade type on entities.

<br>
  
<h2>CascadeType.PERSIST</h2>

I have created a new entity named "ProductDetail" with a OneToOne relationship with the "Product" entity. 

When saving a Product through a POST request, the ProductDetail information will also be provided in the request body. Since the Cascade type is set to persist, the ProductDetail entity will be saved to the database along with its one-to-one relation.

``Product.java``

```java
@Table(name = "Products")
@Entity
public class Product extends BaseEntity implements Serializable {

    // codes here...

    @OneToOne(mappedBy = "product", fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    private ProductDetail productDetail;

    // codes here...
```

<br>

![resim](https://github.com/CanberkTimurlenk/RobotDreams-Spring-Course-Assignment6/assets/18058846/18df1bc5-7f07-4c4b-be24-9517118925af)

<br>

Product Table
![resim](https://github.com/CanberkTimurlenk/RobotDreams-Spring-Course-Assignment6/assets/18058846/0dee6754-dee2-483a-9d83-89440d394684)

<br>

ProductDetail Table
![resim](https://github.com/CanberkTimurlenk/RobotDreams-Spring-Course-Assignment6/assets/18058846/9967450e-a70e-48ca-9e6a-c7220f7c44f6)

<br>
<hr>
<br>

<h2>CascadeType.REMOVE</h2>

When an order is deleted, the related orderProducts must also be deleted.


``Order.java``
```java
@Table(name = "Orders")
@Entity
public class Order extends BaseEntity implements Serializable {

    //codes here

    @OneToMany(mappedBy = "order", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    private Set<OrderProduct> orderProducts;

    //codes here

```

<br>

Post an order
![resim](https://github.com/CanberkTimurlenk/RobotDreams-Spring-Course-Assignment6/assets/18058846/667fddaa-6496-41a6-a9f0-e0c7671b38ea)

<br>

Orders Table <br>
![resim](https://github.com/CanberkTimurlenk/RobotDreams-Spring-Course-Assignment6/assets/18058846/eb5bf637-e0f6-4ded-a3da-451e33e5367f)

<br>

OrderProducts Table <br>

![resim](https://github.com/CanberkTimurlenk/RobotDreams-Spring-Course-Assignment6/assets/18058846/42999fc4-d8bc-4809-a155-1c916d1d4bea)

<br> 

Delete request to delete created Order <br>
![resim](https://github.com/CanberkTimurlenk/RobotDreams-Spring-Course-Assignment6/assets/18058846/93341d79-bb83-4152-a3f2-68cb057c94e8)


<br>

Orders Table <br>
![resim](https://github.com/CanberkTimurlenk/RobotDreams-Spring-Course-Assignment6/assets/18058846/28c2ffb2-7c41-4fcf-938d-f21a546f9a25)

<br>

OrderProducts Table <br>
![resim](https://github.com/CanberkTimurlenk/RobotDreams-Spring-Course-Assignment6/assets/18058846/da0a1fce-e728-4035-88be-a80597beb982)













