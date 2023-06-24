// Code generated by Wire protocol buffer compiler, do not edit.
// Source: squareup.protos.kotlin.MessageUsingMultipleEnums in same_name_enum.proto
package com.squareup.wire.protos.kotlin

import com.squareup.wire.FieldEncoding
import com.squareup.wire.Message
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.ProtoReader
import com.squareup.wire.ProtoWriter
import com.squareup.wire.ReverseProtoWriter
import com.squareup.wire.Syntax.PROTO_2
import com.squareup.wire.WireField
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.jvm.JvmField
import okio.ByteString

/**
 * Enum names must be fully qualified in generated Kotlin
 */
public class MessageUsingMultipleEnums(
  @field:WireField(
    tag = 1,
    adapter = "com.squareup.wire.protos.kotlin.MessageWithStatus${'$'}Status#ADAPTER",
  )
  @JvmField
  public val a: MessageWithStatus.Status? = null,
  @field:WireField(
    tag = 2,
    adapter = "com.squareup.wire.protos.kotlin.OtherMessageWithStatus${'$'}Status#ADAPTER",
  )
  @JvmField
  public val b: OtherMessageWithStatus.Status? = null,
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<MessageUsingMultipleEnums, MessageUsingMultipleEnums.Builder>(ADAPTER, unknownFields) {
  override fun newBuilder(): Builder {
    val builder = Builder()
    builder.a = a
    builder.b = b
    builder.addUnknownFields(unknownFields)
    return builder
  }

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is MessageUsingMultipleEnums) return false
    if (unknownFields != other.unknownFields) return false
    if (a != other.a) return false
    if (b != other.b) return false
    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + (a?.hashCode() ?: 0)
      result = result * 37 + (b?.hashCode() ?: 0)
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    if (a != null) result += """a=$a"""
    if (b != null) result += """b=$b"""
    return result.joinToString(prefix = "MessageUsingMultipleEnums{", separator = ", ", postfix =
        "}")
  }

  public fun copy(
    a: MessageWithStatus.Status? = this.a,
    b: OtherMessageWithStatus.Status? = this.b,
    unknownFields: ByteString = this.unknownFields,
  ): MessageUsingMultipleEnums = MessageUsingMultipleEnums(a, b, unknownFields)

  public class Builder : Message.Builder<MessageUsingMultipleEnums, Builder>() {
    @JvmField
    public var a: MessageWithStatus.Status? = null

    @JvmField
    public var b: OtherMessageWithStatus.Status? = null

    public fun a(a: MessageWithStatus.Status?): Builder {
      this.a = a
      return this
    }

    public fun b(b: OtherMessageWithStatus.Status?): Builder {
      this.b = b
      return this
    }

    override fun build(): MessageUsingMultipleEnums = MessageUsingMultipleEnums(
      a = a,
      b = b,
      unknownFields = buildUnknownFields()
    )
  }

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<MessageUsingMultipleEnums> = object :
        ProtoAdapter<MessageUsingMultipleEnums>(
      FieldEncoding.LENGTH_DELIMITED, 
      MessageUsingMultipleEnums::class, 
      "type.googleapis.com/squareup.protos.kotlin.MessageUsingMultipleEnums", 
      PROTO_2, 
      null, 
      "same_name_enum.proto"
    ) {
      override fun encodedSize(`value`: MessageUsingMultipleEnums): Int {
        var size = value.unknownFields.size
        size += MessageWithStatus.Status.ADAPTER.encodedSizeWithTag(1, value.a)
        size += OtherMessageWithStatus.Status.ADAPTER.encodedSizeWithTag(2, value.b)
        return size
      }

      override fun encode(writer: ProtoWriter, `value`: MessageUsingMultipleEnums) {
        MessageWithStatus.Status.ADAPTER.encodeWithTag(writer, 1, value.a)
        OtherMessageWithStatus.Status.ADAPTER.encodeWithTag(writer, 2, value.b)
        writer.writeBytes(value.unknownFields)
      }

      override fun encode(writer: ReverseProtoWriter, `value`: MessageUsingMultipleEnums) {
        writer.writeBytes(value.unknownFields)
        OtherMessageWithStatus.Status.ADAPTER.encodeWithTag(writer, 2, value.b)
        MessageWithStatus.Status.ADAPTER.encodeWithTag(writer, 1, value.a)
      }

      override fun decode(reader: ProtoReader): MessageUsingMultipleEnums {
        var a: MessageWithStatus.Status? = null
        var b: OtherMessageWithStatus.Status? = null
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> try {
              a = MessageWithStatus.Status.ADAPTER.decode(reader)
            } catch (e: ProtoAdapter.EnumConstantNotFoundException) {
              reader.addUnknownField(tag, FieldEncoding.VARINT, e.value.toLong())
            }
            2 -> try {
              b = OtherMessageWithStatus.Status.ADAPTER.decode(reader)
            } catch (e: ProtoAdapter.EnumConstantNotFoundException) {
              reader.addUnknownField(tag, FieldEncoding.VARINT, e.value.toLong())
            }
            else -> reader.readUnknownField(tag)
          }
        }
        return MessageUsingMultipleEnums(
          a = a,
          b = b,
          unknownFields = unknownFields
        )
      }

      override fun redact(`value`: MessageUsingMultipleEnums): MessageUsingMultipleEnums =
          value.copy(
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }
}
