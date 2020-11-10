package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.PostsApiService;
import io.swagger.api.factories.PostsApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import io.swagger.model.Comment;
import io.swagger.model.Post;
import io.swagger.model.Reaction;
import io.swagger.model.Reply;

import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;

@Path("/posts")


@io.swagger.annotations.Api(description = "the posts API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2020-11-07T12:35:50.314Z")
public class PostsApi  {
   private final PostsApiService delegate;

   public PostsApi(@Context ServletConfig servletContext) {
      PostsApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("PostsApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (PostsApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = PostsApiServiceFactory.getPostsApi();
      }

      this.delegate = delegate;
   }

    @POST
    @Path("/{postId}/comments")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Add a reaction to a post", notes = "", response = Void.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Pet not found", response = Void.class) })
    public Response addComment(@ApiParam(value = "ID of post to return",required=true) @PathParam("postId") Long postId
,@ApiParam(value = "Add a post" ,required=true) Comment body
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.addComment(postId,body,securityContext);
    }
    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Add a post", notes = "", response = Post.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Post.class),
        
        @io.swagger.annotations.ApiResponse(code = 405, message = "Invalid input", response = Void.class) })
    public Response addPost(@ApiParam(value = "Add a post" ,required=true) Post body
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.addPost(body,securityContext);
    }
    @POST
    @Path("/{postId}/comments/{commentId}/reactions")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Add a reaction to a comment", notes = "", response = Void.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Pet not found", response = Void.class) })
    public Response addReactionToComment(@ApiParam(value = "ID of post to return",required=true) @PathParam("postId") Long postId
,@ApiParam(value = "ID of post to return",required=true) @PathParam("commentId") Long commentId
,@ApiParam(value = "Add a reaction" ,required=true) Reaction body
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.addReactionToComment(postId,commentId,body,securityContext);
    }
    @POST
    @Path("/{postId}/comments/{commentId}/replies/{replyId}/reactions")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Add a text to a reply", notes = "", response = Void.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Pet not found", response = Void.class) })
    public Response addReactionToReply(@ApiParam(value = "ID of post to return",required=true) @PathParam("postId") Long postId
,@ApiParam(value = "ID of comment to return",required=true) @PathParam("commentId") Long commentId
,@ApiParam(value = "ID of reply to return",required=true) @PathParam("replyId") Long replyId
,@ApiParam(value = "Add a reaction to reply" ,required=true) Reaction body
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.addReactionToReply(postId,commentId,replyId,body,securityContext);
    }
    @POST
    @Path("/{postId}/reactions")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Add a reaction to a post", notes = "", response = Void.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Pet not found", response = Void.class) })
    public Response addReactiontoPost(@ApiParam(value = "ID of post to return",required=true) @PathParam("postId") Long postId
,@ApiParam(value = "Add a post" ,required=true) Reaction body
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.addReactiontoPost(postId,body,securityContext);
    }
    @POST
    @Path("/{postId}/comments/{commentId}/replies")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Add a reply to a comment", notes = "", response = Void.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Pet not found", response = Void.class) })
    public Response addReplyToComment(@ApiParam(value = "ID of post to return",required=true) @PathParam("postId") Long postId
,@ApiParam(value = "ID of post to return",required=true) @PathParam("commentId") Long commentId
,@ApiParam(value = "Add a post" ,required=true) Reply body
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.addReplyToComment(postId,commentId,body,securityContext);
    }
    @DELETE
    @Path("/{postId}/comments/{commentId}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Remove a post comment", notes = "", response = Void.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Pet not found", response = Void.class) })
    public Response deleteComment(@ApiParam(value = "ID of post to return",required=true) @PathParam("postId") Long postId
,@ApiParam(value = "ID of post to modify",required=true) @PathParam("commentId") Long commentId
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteComment(postId,commentId,securityContext);
    }
    @DELETE
    @Path("/{postId}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete the post", notes = "", response = Void.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Pet not found", response = Void.class) })
    public Response deletePost(@ApiParam(value = "ID of post to return",required=true) @PathParam("postId") Long postId
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deletePost(postId,securityContext);
    }
    @DELETE
    @Path("/{postId}/comments/{commentId}/replies/{replyId}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Remove a reply comment", notes = "", response = Void.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Pet not found", response = Void.class) })
    public Response deleteReply(@ApiParam(value = "ID of post to return",required=true) @PathParam("postId") Long postId
,@ApiParam(value = "ID of comment to return",required=true) @PathParam("commentId") Long commentId
,@ApiParam(value = "ID of reply to delete",required=true) @PathParam("replyId") Long replyId
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteReply(postId,commentId,replyId,securityContext);
    }
    @GET
    @Path("/{postId}/comments")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get list of posts", notes = "", response = Comment.class, responseContainer = "List", tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Comment.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "invalid status value", response = Void.class) })
    public Response getComments(@ApiParam(value = "ID of comments to return",required=true) @PathParam("postId") Long postId
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getComments(postId,securityContext);
    }
    @GET
    @Path("/{postId}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get a single post", notes = "", response = Post.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Post.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Pet not found", response = Void.class) })
    public Response getPost(@ApiParam(value = "ID of post to return",required=true) @PathParam("postId") Long postId
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getPost(postId,securityContext);
    }
    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get list of posts", notes = "", response = Post.class, responseContainer = "List", tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Post.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "invalid status value", response = Void.class) })
    public Response getPosts(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getPosts(securityContext);
    }
    @GET
    @Path("/{postId}/comments/{commentId}/replies")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "the replies for a comment", notes = "", response = Reply.class, responseContainer = "List", tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Reply.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "invalid status value", response = Void.class) })
    public Response getReplies(@ApiParam(value = "ID of comments to return",required=true) @PathParam("postId") Long postId
,@ApiParam(value = "ID of post to return",required=true) @PathParam("commentId") Long commentId
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getReplies(postId,commentId,securityContext);
    }
    @PATCH
    @Path("/{postId}/comments/{commentId}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Modify the text of a comment", notes = "", response = Comment.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Comment.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Pet not found", response = Void.class) })
    public Response updateComment(@ApiParam(value = "ID of post to return",required=true) @PathParam("postId") Long postId
,@ApiParam(value = "Modify the comment" ,required=true) Comment body
,@ApiParam(value = "ID of post to modify",required=true) @PathParam("commentId") Long commentId
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateComment(postId,body,commentId,securityContext);
    }
    @PATCH
    @Path("/{postId}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Modify the text of a post", notes = "", response = Post.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Post.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Pet not found", response = Void.class) })
    public Response updatePost(@ApiParam(value = "ID of post to return",required=true) @PathParam("postId") Long postId
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updatePost(postId,securityContext);
    }
    @PATCH
    @Path("/{postId}/comments/{commentId}/replies/{replyId}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Modify the text of a reply", notes = "", response = Void.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Pet not found", response = Void.class) })
    public Response updateReply(@ApiParam(value = "ID of post to return",required=true) @PathParam("postId") Long postId
,@ApiParam(value = "Modify the comment" ,required=true) Reply body
,@ApiParam(value = "ID of comment to modify",required=true) @PathParam("commentId") Long commentId
,@ApiParam(value = "ID of reply to modify",required=true) @PathParam("replyId") Long replyId
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateReply(postId,body,commentId,replyId,securityContext);
    }
}
