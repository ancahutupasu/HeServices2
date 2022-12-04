package com.example.heservices.data;

 public class User {
    private String uid;
    private String userName;
    private String email;
    private int reviews;
    private String fullName;
    private String phone;
    private Role role;

    public User(String uid, String userName) {
        this.uid = uid;
        this.userName = userName;
        email = null;
        reviews = 0;
        fullName = null;
        phone = null;
        role = Role.MEMBER;
    }

    public User(Role role, String uid, String userName, String email, String phone, int reviews, String fullName) {
        this.uid = uid;
        this.userName = userName;
        this.phone = phone;
        this.email = email;
        this.reviews = reviews;
        this.fullName = fullName;
        this.role = role;
    }

     public User()
     {
     }

     public String getUid() {
         return uid;
     }

     public void setUid(String uid) {
         this.uid = uid;
     }

     public String getUserName() {
         return userName;
     }

     public void setUserName(String userName) {
         this.userName = userName;
     }

     public String getEmail() {
         return email;
     }

     public void setRole(Role role) {
         this.role = role;
     }

     public Role getRole() {
         return role;
     }

     public void setEmail(String email) {
         this.email = email;
     }

     public int getReviews() {
         return reviews;
     }

     public void setReviews(int reviews) {
         this.reviews = reviews;
     }

     public String getFullName() {
         return fullName;
     }

     public String getPhone() {
         return phone;
     }

     public void setPhone(String phone) {
         this.phone = phone;
     }

     public void setFullName(String fullName) {
         this.fullName = fullName;
     }


     @Override
     public String toString() {
         return "User{" +
                 "uid='" + uid + '\'' +
                 ", userName='" + userName + '\'' +
                 ", email='" + email + '\'' +
                 ", reviews=" + reviews +
                 ", fullName='" + fullName + '\'' +
                 '}';
     }
}
