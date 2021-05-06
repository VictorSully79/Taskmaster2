package com.amplifyframework.datastore.generated.model;


import java.util.List;
import java.util.UUID;
import java.util.Objects;

import androidx.core.util.ObjectsCompat;

import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.annotations.Index;
import com.amplifyframework.core.model.annotations.ModelConfig;
import com.amplifyframework.core.model.annotations.ModelField;
import com.amplifyframework.core.model.query.predicate.QueryField;

import static com.amplifyframework.core.model.query.predicate.QueryField.field;

/** This is an auto generated class representing the taskmaster2 type in your schema. */
@SuppressWarnings("all")
@ModelConfig(pluralName = "taskmaster2s")
public final class taskmaster2 implements Model {
  public static final QueryField ID = field("taskmaster2", "id");
  public static final QueryField NAME = field("taskmaster2", "name");
  public static final QueryField PRIORITY = field("taskmaster2", "priority");
  public static final QueryField DESCRIPTION = field("taskmaster2", "description");
  private final @ModelField(targetType="ID", isRequired = true) String id;
  private final @ModelField(targetType="String", isRequired = true) String name;
  private final @ModelField(targetType="Priority") Priority priority;
  private final @ModelField(targetType="String") String description;
  public String getId() {
      return id;
  }
  
  public String getName() {
      return name;
  }
  
  public Priority getPriority() {
      return priority;
  }
  
  public String getDescription() {
      return description;
  }
  
  private taskmaster2(String id, String name, Priority priority, String description) {
    this.id = id;
    this.name = name;
    this.priority = priority;
    this.description = description;
  }
  
  @Override
   public boolean equals(Object obj) {
      if (this == obj) {
        return true;
      } else if(obj == null || getClass() != obj.getClass()) {
        return false;
      } else {
      taskmaster2 taskmaster2 = (taskmaster2) obj;
      return ObjectsCompat.equals(getId(), taskmaster2.getId()) &&
              ObjectsCompat.equals(getName(), taskmaster2.getName()) &&
              ObjectsCompat.equals(getPriority(), taskmaster2.getPriority()) &&
              ObjectsCompat.equals(getDescription(), taskmaster2.getDescription());
      }
  }
  
  @Override
   public int hashCode() {
    return new StringBuilder()
      .append(getId())
      .append(getName())
      .append(getPriority())
      .append(getDescription())
      .toString()
      .hashCode();
  }
  
  @Override
   public String toString() {
    return new StringBuilder()
      .append("taskmaster2 {")
      .append("id=" + String.valueOf(getId()) + ", ")
      .append("name=" + String.valueOf(getName()) + ", ")
      .append("priority=" + String.valueOf(getPriority()) + ", ")
      .append("description=" + String.valueOf(getDescription()))
      .append("}")
      .toString();
  }
  
  public static NameStep builder() {
      return new Builder();
  }
  
  /** 
   * WARNING: This method should not be used to build an instance of this object for a CREATE mutation.
   * This is a convenience method to return an instance of the object with only its ID populated
   * to be used in the context of a parameter in a delete mutation or referencing a foreign key
   * in a relationship.
   * @param id the id of the existing item this instance will represent
   * @return an instance of this model with only ID populated
   * @throws IllegalArgumentException Checks that ID is in the proper format
   */
  public static taskmaster2 justId(String id) {
    try {
      UUID.fromString(id); // Check that ID is in the UUID format - if not an exception is thrown
    } catch (Exception exception) {
      throw new IllegalArgumentException(
              "Model IDs must be unique in the format of UUID. This method is for creating instances " +
              "of an existing object with only its ID field for sending as a mutation parameter. When " +
              "creating a new object, use the standard builder method and leave the ID field blank."
      );
    }
    return new taskmaster2(
      id,
      null,
      null,
      null
    );
  }
  
  public CopyOfBuilder copyOfBuilder() {
    return new CopyOfBuilder(id,
      name,
      priority,
      description);
  }
  public interface NameStep {
    BuildStep name(String name);
  }
  

  public interface BuildStep {
    taskmaster2 build();
    BuildStep id(String id) throws IllegalArgumentException;
    BuildStep priority(Priority priority);
    BuildStep description(String description);
  }
  

  public static class Builder implements NameStep, BuildStep {
    private String id;
    private String name;
    private Priority priority;
    private String description;
    @Override
     public taskmaster2 build() {
        String id = this.id != null ? this.id : UUID.randomUUID().toString();
        
        return new taskmaster2(
          id,
          name,
          priority,
          description);
    }
    
    @Override
     public BuildStep name(String name) {
        Objects.requireNonNull(name);
        this.name = name;
        return this;
    }
    
    @Override
     public BuildStep priority(Priority priority) {
        this.priority = priority;
        return this;
    }
    
    @Override
     public BuildStep description(String description) {
        this.description = description;
        return this;
    }
    
    /** 
     * WARNING: Do not set ID when creating a new object. Leave this blank and one will be auto generated for you.
     * This should only be set when referring to an already existing object.
     * @param id id
     * @return Current Builder instance, for fluent method chaining
     * @throws IllegalArgumentException Checks that ID is in the proper format
     */
    public BuildStep id(String id) throws IllegalArgumentException {
        this.id = id;
        
        try {
            UUID.fromString(id); // Check that ID is in the UUID format - if not an exception is thrown
        } catch (Exception exception) {
          throw new IllegalArgumentException("Model IDs must be unique in the format of UUID.",
                    exception);
        }
        
        return this;
    }
  }
  

  public final class CopyOfBuilder extends Builder {
    private CopyOfBuilder(String id, String name, Priority priority, String description) {
      super.id(id);
      super.name(name)
        .priority(priority)
        .description(description);
    }
    
    @Override
     public CopyOfBuilder name(String name) {
      return (CopyOfBuilder) super.name(name);
    }
    
    @Override
     public CopyOfBuilder priority(Priority priority) {
      return (CopyOfBuilder) super.priority(priority);
    }
    
    @Override
     public CopyOfBuilder description(String description) {
      return (CopyOfBuilder) super.description(description);
    }
  }
  
}
