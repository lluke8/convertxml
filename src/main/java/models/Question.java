package models;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.ArrayList;


@XmlRootElement(name = "question")
public class Question implements Serializable {


    private int id;
    private ArrayList<Answer> answers = new ArrayList<Answer>();
    private String questionname;


    public Question(){
    }

    @XmlAttribute
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @XmlElement
    public ArrayList<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(ArrayList<Answer> answers) {
        this.answers = answers;
    }

    @XmlElement
    public String getQuestionname() {
        return questionname;
    }

    public void setQuestionname(String questionname) {
        this.questionname = questionname;
    }

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", answers=" + answers +
                ", questionname='" + questionname + '\'' +
                '}';
    }
}
