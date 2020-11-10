package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import io.swagger.model.Comment;
import io.swagger.model.Post;
import io.swagger.model.Reaction;
import io.swagger.model.Reply;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2020-11-07T12:35:50.314Z")
public abstract class PostsApiService {
    public abstract Response addComment(Long postId,Comment body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response addPost(Post body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response addReactionToComment(Long postId,Long commentId,Reaction body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response addReactionToReply(Long postId,Long commentId,Long replyId,Reaction body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response addReactiontoPost(Long postId,Reaction body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response addReplyToComment(Long postId,Long commentId,Reply body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deleteComment(Long postId,Long commentId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deletePost(Long postId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deleteReply(Long postId,Long commentId,Long replyId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getComments(Long postId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getPost(Long postId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getPosts(SecurityContext securityContext) throws NotFoundException;
    public abstract Response getReplies(Long postId,Long commentId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response updateComment(Long postId,Comment body,Long commentId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response updatePost(Long postId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response updateReply(Long postId,Reply body,Long commentId,Long replyId,SecurityContext securityContext) throws NotFoundException;
}
