/*
 * Aplicação
 * Serviço do backend da aplicação do Ronda senior X
 *
 * OpenAPI spec version: 4.7.0
 * Contact: seniorx-dev@senior.com.br
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package br.com.senior.sam.application.pojos;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import br.com.senior.sam.application.pojos.DvrServerType;
import java.io.IOException;

/**
 * DvrServer
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-08-24T13:38:01.755Z")



public class DvrServer {
  @SerializedName("password")
  private String password = null;

  @SerializedName("port")
  private Integer port = null;

  @SerializedName("urlPrefix")
  private String urlPrefix = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("dvrServerType")
  private DvrServerType dvrServerType = null;

  @SerializedName("host")
  private String host = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("user")
  private String user = null;

  @SerializedName("serverId")
  private String serverId = null;

  @SerializedName("networkDomain")
  private String networkDomain = null;

  public DvrServer password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Senha de Acesso
   * @return password
  **/
  @ApiModelProperty(value = "Senha de Acesso")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public DvrServer port(Integer port) {
    this.port = port;
    return this;
  }

   /**
   * Porta de Comunicação
   * @return port
  **/
  @ApiModelProperty(value = "Porta de Comunicação")
  public Integer getPort() {
    return port;
  }

  public void setPort(Integer port) {
    this.port = port;
  }

  public DvrServer urlPrefix(String urlPrefix) {
    this.urlPrefix = urlPrefix;
    return this;
  }

   /**
   * Prefixo da URL
   * @return urlPrefix
  **/
  @ApiModelProperty(value = "Prefixo da URL")
  public String getUrlPrefix() {
    return urlPrefix;
  }

  public void setUrlPrefix(String urlPrefix) {
    this.urlPrefix = urlPrefix;
  }

  public DvrServer name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Nome do Servidor
   * @return name
  **/
  @ApiModelProperty(value = "Nome do Servidor")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DvrServer dvrServerType(DvrServerType dvrServerType) {
    this.dvrServerType = dvrServerType;
    return this;
  }

   /**
   * Get dvrServerType
   * @return dvrServerType
  **/
  @ApiModelProperty(value = "")
  public DvrServerType getDvrServerType() {
    return dvrServerType;
  }

  public void setDvrServerType(DvrServerType dvrServerType) {
    this.dvrServerType = dvrServerType;
  }

  public DvrServer host(String host) {
    this.host = host;
    return this;
  }

   /**
   * Identificador de Rede
   * @return host
  **/
  @ApiModelProperty(value = "Identificador de Rede")
  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }

  public DvrServer id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * ID
   * @return id
  **/
  @ApiModelProperty(value = "ID")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public DvrServer user(String user) {
    this.user = user;
    return this;
  }

   /**
   * Usuário de Acesso
   * @return user
  **/
  @ApiModelProperty(value = "Usuário de Acesso")
  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }

  public DvrServer serverId(String serverId) {
    this.serverId = serverId;
    return this;
  }

   /**
   * Identificador do Servidor
   * @return serverId
  **/
  @ApiModelProperty(value = "Identificador do Servidor")
  public String getServerId() {
    return serverId;
  }

  public void setServerId(String serverId) {
    this.serverId = serverId;
  }

  public DvrServer networkDomain(String networkDomain) {
    this.networkDomain = networkDomain;
    return this;
  }

   /**
   * Domínio de Rede
   * @return networkDomain
  **/
  @ApiModelProperty(value = "Domínio de Rede")
  public String getNetworkDomain() {
    return networkDomain;
  }

  public void setNetworkDomain(String networkDomain) {
    this.networkDomain = networkDomain;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DvrServer dvrServer = (DvrServer) o;
    return Objects.equals(this.password, dvrServer.password) &&
        Objects.equals(this.port, dvrServer.port) &&
        Objects.equals(this.urlPrefix, dvrServer.urlPrefix) &&
        Objects.equals(this.name, dvrServer.name) &&
        Objects.equals(this.dvrServerType, dvrServer.dvrServerType) &&
        Objects.equals(this.host, dvrServer.host) &&
        Objects.equals(this.id, dvrServer.id) &&
        Objects.equals(this.user, dvrServer.user) &&
        Objects.equals(this.serverId, dvrServer.serverId) &&
        Objects.equals(this.networkDomain, dvrServer.networkDomain);
  }

  @Override
  public int hashCode() {
    return Objects.hash(password, port, urlPrefix, name, dvrServerType, host, id, user, serverId, networkDomain);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DvrServer {\n");
    
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    urlPrefix: ").append(toIndentedString(urlPrefix)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dvrServerType: ").append(toIndentedString(dvrServerType)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    serverId: ").append(toIndentedString(serverId)).append("\n");
    sb.append("    networkDomain: ").append(toIndentedString(networkDomain)).append("\n");
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

