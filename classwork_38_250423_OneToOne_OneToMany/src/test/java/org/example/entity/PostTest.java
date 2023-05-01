package org.example.entity;

import org.example.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PostTest {

    @Test
    public void initPostTest() {
        try (SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
             Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            Post post = new Post();
            post.setTitle("Test title " + Math.ceil(Math.random() * 10));
            post.setContent("Any content provided " + Math.ceil(Math.random() * 20));
            List<PostComment> comments = List.of(
                    new PostComment("Number " + Math.ceil(Math.random() * 30), post),
                    new PostComment("Number " + Math.ceil(Math.random() * 70), post)
            );
            post.setComments(comments);
            session.save(post);
            transaction.commit();
        }
    }

    @Test
    public void getPostTest() {
        try (SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
             Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            Post post = session.get(Post.class, 2L);
            System.out.println(post);
            transaction.commit();
        }
    }

}