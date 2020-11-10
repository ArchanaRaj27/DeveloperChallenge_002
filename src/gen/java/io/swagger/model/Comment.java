/*
 * AppyChat
 * This is a social media application server called AppyChat.  You can find out more about     Swagger at [http://swagger.io](http://swagger.io) or on [irc.freenode.net, #swagger](http://swagger.io/irc/).      For this sample, you can use the api key `special-key` to test the authorization     filters.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: archana.raj@truecommerce.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Reaction;
import io.swagger.model.Reply;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Comment
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2020-11-07T12:35:50.314Z")
public class Comment   {
  @JsonProperty("created")
  private Date created = null;

  @JsonProperty("author")
  private String author = null;

  @JsonProperty("text")
  private String text = null;

  @JsonProperty("gifLink")
  private String gifLink = null;

  @JsonProperty("reactionCounts")
  private Object reactionCounts = null;

  @JsonProperty("reply")
  private List<Reply> reply = null;

  @JsonProperty("reaction")
  private List<Reaction> reaction = null;

  public Comment created(Date created) {
    this.created = created;
    return this;
  }

  /**
   * date-time comment added
   * @return created
   **/
  @JsonProperty("created")
  @ApiModelProperty(value = "date-time comment added")
  @Valid
  public Date getCreated() {
    return created;
  }

  public void setCreated(Date created) {
    this.created = created;
  }

  public Comment author(String author) {
    this.author = author;
    return this;
  }

  /**
   * Author ID
   * @return author
   **/
  @JsonProperty("author")
  @ApiModelProperty(value = "Author ID")
  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public Comment text(String text) {
    this.text = text;
    return this;
  }

  /**
   * Comment text
   * @return text
   **/
  @JsonProperty("text")
  @ApiModelProperty(value = "Comment text")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public Comment gifLink(String gifLink) {
    this.gifLink = gifLink;
    return this;
  }

  /**
   * Links to the GIFs
   * @return gifLink
   **/
  @JsonProperty("gifLink")
  @ApiModelProperty(value = "Links to the GIFs")
  public String getGifLink() {
    return gifLink;
  }

  public void setGifLink(String gifLink) {
    this.gifLink = gifLink;
  }

  public Comment reactionCounts(Object reactionCounts) {
    this.reactionCounts = reactionCounts;
    return this;
  }

  /**
   * Get reactionCounts
   * @return reactionCounts
   **/
  @JsonProperty("reactionCounts")
  @ApiModelProperty(value = "")
  public Object getReactionCounts() {
    return reactionCounts;
  }

  public void setReactionCounts(Object reactionCounts) {
    this.reactionCounts = reactionCounts;
  }

  public Comment reply(List<Reply> reply) {
    this.reply = reply;
    return this;
  }

  public Comment addReplyItem(Reply replyItem) {
    if (this.reply == null) {
      this.reply = new ArrayList<Reply>();
    }
    this.reply.add(replyItem);
    return this;
  }

  /**
   * Get reply
   * @return reply
   **/
  @JsonProperty("reply")
  @ApiModelProperty(value = "")
  @Valid
  public List<Reply> getReply() {
    return reply;
  }

  public void setReply(List<Reply> reply) {
    this.reply = reply;
  }

  public Comment reaction(List<Reaction> reaction) {
    this.reaction = reaction;
    return this;
  }

  public Comment addReactionItem(Reaction reactionItem) {
    if (this.reaction == null) {
      this.reaction = new ArrayList<Reaction>();
    }
    this.reaction.add(reactionItem);
    return this;
  }

  /**
   * Get reaction
   * @return reaction
   **/
  @JsonProperty("reaction")
  @ApiModelProperty(value = "")
  @Valid
  public List<Reaction> getReaction() {
    return reaction;
  }

  public void setReaction(List<Reaction> reaction) {
    this.reaction = reaction;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Comment comment = (Comment) o;
    return Objects.equals(this.created, comment.created) &&
        Objects.equals(this.author, comment.author) &&
        Objects.equals(this.text, comment.text) &&
        Objects.equals(this.gifLink, comment.gifLink) &&
        Objects.equals(this.reactionCounts, comment.reactionCounts) &&
        Objects.equals(this.reply, comment.reply) &&
        Objects.equals(this.reaction, comment.reaction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(created, author, text, gifLink, reactionCounts, reply, reaction);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Comment {\n");
    
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    gifLink: ").append(toIndentedString(gifLink)).append("\n");
    sb.append("    reactionCounts: ").append(toIndentedString(reactionCounts)).append("\n");
    sb.append("    reply: ").append(toIndentedString(reply)).append("\n");
    sb.append("    reaction: ").append(toIndentedString(reaction)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
