package lv.tsi.exam;

import javax.persistence.GeneratedValue;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;



    @Entity
    public class LibraryBD {

        @Id
        @GeneratedValue
        private Long id;
        private String author;
        private String title;
        private String body;
        private String zhanr;

        @OneToMany
        @JoinColumn(name="bookId")
        private List<CommentEntity> commentsList;

        public LibraryBD(Long id, String author, String title, String body, String zhanr, List<CommentEntity> commentsList) {
            this.id = id;
            this.author = author;
            this.title = title;
            this.body = body;
            this.zhanr = zhanr;
            this.commentsList = commentsList;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getBody() {
            return body;
        }

        public void setBody(String body) {
            this.body = body;
        }

        public void setzhanr(String zhanr){
            this.zhanr = zhanr;
        }

        public List<CommentEntity> getCommentsList() {
            return commentsList;
        }

        public void setCommentsList(List<CommentEntity> commentsList) {
            this.commentsList = commentsList;
        }
}