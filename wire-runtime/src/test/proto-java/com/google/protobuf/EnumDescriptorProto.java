// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: google/protobuf/descriptor.proto at 168:1
package com.google.protobuf;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.util.List;
import okio.ByteString;

/**
 * Describes an enum type.
 */
public final class EnumDescriptorProto extends Message<EnumDescriptorProto, EnumDescriptorProto.Builder> {
  public static final ProtoAdapter<EnumDescriptorProto> ADAPTER = new ProtoAdapter<EnumDescriptorProto>(FieldEncoding.LENGTH_DELIMITED, EnumDescriptorProto.class) {
    @Override
    public int encodedSize(EnumDescriptorProto value) {
      return (value.name != null ? ProtoAdapter.STRING.encodedSizeWithTag(1, value.name) : 0)
          + (value.doc != null ? ProtoAdapter.STRING.encodedSizeWithTag(4, value.doc) : 0)
          + EnumValueDescriptorProto.ADAPTER.asRepeated().encodedSizeWithTag(2, value.value)
          + (value.options != null ? EnumOptions.ADAPTER.encodedSizeWithTag(3, value.options) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, EnumDescriptorProto value) throws IOException {
      if (value.name != null) ProtoAdapter.STRING.encodeWithTag(writer, 1, value.name);
      if (value.doc != null) ProtoAdapter.STRING.encodeWithTag(writer, 4, value.doc);
      if (value.value != null) EnumValueDescriptorProto.ADAPTER.asRepeated().encodeWithTag(writer, 2, value.value);
      if (value.options != null) EnumOptions.ADAPTER.encodeWithTag(writer, 3, value.options);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public EnumDescriptorProto decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.name(ProtoAdapter.STRING.decode(reader)); break;
          case 4: builder.doc(ProtoAdapter.STRING.decode(reader)); break;
          case 2: builder.value.add(EnumValueDescriptorProto.ADAPTER.decode(reader)); break;
          case 3: builder.options(EnumOptions.ADAPTER.decode(reader)); break;
          default: {
            FieldEncoding fieldEncoding = reader.peekFieldEncoding();
            Object value = fieldEncoding.rawProtoAdapter().decode(reader);
            builder.addUnknownField(tag, fieldEncoding, value);
          }
        }
      }
      reader.endMessage(token);
      return builder.build();
    }

    @Override
    public EnumDescriptorProto redact(EnumDescriptorProto value) {
      Builder builder = value.newBuilder();
      redactElements(builder.value, EnumValueDescriptorProto.ADAPTER);
      if (builder.options != null) builder.options = EnumOptions.ADAPTER.redact(builder.options);
      builder.clearUnknownFields();
      return builder.build();
    }
  };

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_NAME = "";

  public static final String DEFAULT_DOC = "";

  public final String name;

  /**
   * Doc string for generated code.
   */
  public final String doc;

  public final List<EnumValueDescriptorProto> value;

  public final EnumOptions options;

  public EnumDescriptorProto(String name, String doc, List<EnumValueDescriptorProto> value, EnumOptions options) {
    this(name, doc, value, options, ByteString.EMPTY);
  }

  public EnumDescriptorProto(String name, String doc, List<EnumValueDescriptorProto> value, EnumOptions options, ByteString unknownFields) {
    super(unknownFields);
    this.name = name;
    this.doc = doc;
    this.value = immutableCopyOf("value", value);
    this.options = options;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.name = name;
    builder.doc = doc;
    builder.value = copyOf("value", value);
    builder.options = options;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof EnumDescriptorProto)) return false;
    EnumDescriptorProto o = (EnumDescriptorProto) other;
    return equals(unknownFields(), o.unknownFields())
        && equals(name, o.name)
        && equals(doc, o.doc)
        && equals(value, o.value)
        && equals(options, o.options);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (name != null ? name.hashCode() : 0);
      result = result * 37 + (doc != null ? doc.hashCode() : 0);
      result = result * 37 + (value != null ? value.hashCode() : 1);
      result = result * 37 + (options != null ? options.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (name != null) builder.append(", name=").append(name);
    if (doc != null) builder.append(", doc=").append(doc);
    if (value != null) builder.append(", value=").append(value);
    if (options != null) builder.append(", options=").append(options);
    return builder.replace(0, 2, "EnumDescriptorProto{").append('}').toString();
  }

  public static final class Builder extends com.squareup.wire.Message.Builder<EnumDescriptorProto, Builder> {
    public String name;

    public String doc;

    public List<EnumValueDescriptorProto> value;

    public EnumOptions options;

    public Builder() {
      value = newMutableList();
    }

    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Doc string for generated code.
     */
    public Builder doc(String doc) {
      this.doc = doc;
      return this;
    }

    public Builder value(List<EnumValueDescriptorProto> value) {
      checkElementsNotNull(value);
      this.value = value;
      return this;
    }

    public Builder options(EnumOptions options) {
      this.options = options;
      return this;
    }

    @Override
    public EnumDescriptorProto build() {
      return new EnumDescriptorProto(name, doc, value, options, buildUnknownFields());
    }
  }
}
