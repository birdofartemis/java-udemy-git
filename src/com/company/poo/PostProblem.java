package com.company.poo;

import com.company.poo.entities.Comment;
import com.company.poo.entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PostProblem {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comment c1 = new Comment("Ow incredible!");
        Comment c2 = new Comment("Cool!");
        Post post1 = new Post("Vacations in Luanda",
                "It's amazing!",
                12);

        post1.addComment(c1);
        post1.addComment(c2);

        System.out.println(post1);
    }

}
