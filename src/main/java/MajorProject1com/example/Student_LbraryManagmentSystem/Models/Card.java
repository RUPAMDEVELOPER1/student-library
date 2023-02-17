package MajorProject1com.example.Student_LbraryManagmentSystem.Models;

import MajorProject1com.example.Student_LbraryManagmentSystem.Enums.CardStatus;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Entity
@Table(name="card")
public class Card {
    //plan is to save the card number
    //before solving i need to set its attiribute

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;//its autogenerate no need to set

    @CreationTimestamp //auto time stamp when entry is created
    private Date createdOn;//auto

    @UpdateTimestamp// set time when an entry updated
    private Date updateOn;//auto


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public Date getUpdateOn() {
        return updateOn;
    }

    public void setUpdateOn(Date updateOn) {
        this.updateOn = updateOn;
    }

    public CardStatus getCardStatus() {
        return cardStatus;
    }

    public void setCardStatus(CardStatus cardStatus) {
        this.cardStatus = cardStatus;
    }

    @Enumerated(value = EnumType.STRING)//telling sql to take it as String datatype
    private CardStatus cardStatus;


    public Card(int id, Date createdOn, Date updateOn, CardStatus cardStatus, Student studentVariableName) {
        this.id = id;
        this.createdOn = createdOn;
        this.updateOn = updateOn;
        this.cardStatus = cardStatus;
        StudentVariableName = studentVariableName;
    }

    public Student getStudentVariableName() {
        return StudentVariableName;
    }

    public void setStudentVariableName(Student studentVariableName) {
        StudentVariableName = studentVariableName;
    }

    @OneToOne
    @JoinColumn
    private Student StudentVariableName;//this variable used in the parent class while doing the bu directionl mapping

    public Card() {
    }


}
