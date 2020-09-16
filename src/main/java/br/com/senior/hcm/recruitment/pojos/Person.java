/*
 * Recrutamento e Seleção
 * Serviço do Gestão de Recrutamento e Seleção.
 *
 * OpenAPI spec version: 16.0.2
 * Contact: seniorx-dev@senior.com.br
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package br.com.senior.hcm.recruitment.pojos;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Person
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-16T19:14:01.468Z")



public class Person {
  @SerializedName("photoThumbnailLink")
  private String photoThumbnailLink = null;

  @SerializedName("fullName")
  private String fullName = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("photoLink")
  private String photoLink = null;

  @SerializedName("username")
  private String username = null;

  public Person photoThumbnailLink(String photoThumbnailLink) {
    this.photoThumbnailLink = photoThumbnailLink;
    return this;
  }

   /**
   * Link foto miniatura.
   * @return photoThumbnailLink
  **/
  @ApiModelProperty(value = "Link foto miniatura.")
  public String getPhotoThumbnailLink() {
    return photoThumbnailLink;
  }

  public void setPhotoThumbnailLink(String photoThumbnailLink) {
    this.photoThumbnailLink = photoThumbnailLink;
  }

  public Person fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

   /**
   * Nome completo da pessoa.
   * @return fullName
  **/
  @ApiModelProperty(value = "Nome completo da pessoa.")
  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public Person id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Identificador único da entidade.
   * @return id
  **/
  @ApiModelProperty(value = "Identificador único da entidade.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Person photoLink(String photoLink) {
    this.photoLink = photoLink;
    return this;
  }

   /**
   * Link foto.
   * @return photoLink
  **/
  @ApiModelProperty(value = "Link foto.")
  public String getPhotoLink() {
    return photoLink;
  }

  public void setPhotoLink(String photoLink) {
    this.photoLink = photoLink;
  }

  public Person username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Nome de usuário da pessoa.
   * @return username
  **/
  @ApiModelProperty(value = "Nome de usuário da pessoa.")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Person person = (Person) o;
    return Objects.equals(this.photoThumbnailLink, person.photoThumbnailLink) &&
        Objects.equals(this.fullName, person.fullName) &&
        Objects.equals(this.id, person.id) &&
        Objects.equals(this.photoLink, person.photoLink) &&
        Objects.equals(this.username, person.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(photoThumbnailLink, fullName, id, photoLink, username);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Person {\n");
    
    sb.append("    photoThumbnailLink: ").append(toIndentedString(photoThumbnailLink)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    photoLink: ").append(toIndentedString(photoLink)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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

