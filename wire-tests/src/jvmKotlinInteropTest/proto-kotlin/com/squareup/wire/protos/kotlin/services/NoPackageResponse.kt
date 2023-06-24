// Code generated by Wire protocol buffer compiler, do not edit.
// Source: NoPackageResponse in service_without_package.proto
package com.squareup.wire.protos.kotlin.services

import com.squareup.wire.FieldEncoding
import com.squareup.wire.Message
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.ProtoReader
import com.squareup.wire.ProtoWriter
import com.squareup.wire.ReverseProtoWriter
import com.squareup.wire.Syntax.PROTO_2
import kotlin.Any
import kotlin.AssertionError
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.DeprecationLevel
import kotlin.Int
import kotlin.Long
import kotlin.Nothing
import kotlin.String
import kotlin.jvm.JvmField
import okio.ByteString

public class NoPackageResponse(
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<NoPackageResponse, Nothing>(ADAPTER, unknownFields) {
  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN,
  )
  override fun newBuilder(): Nothing = throw
      AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is NoPackageResponse) return false
    if (unknownFields != other.unknownFields) return false
    return true
  }

  override fun hashCode(): Int = unknownFields.hashCode()

  override fun toString(): String = "NoPackageResponse{}"

  public fun copy(unknownFields: ByteString = this.unknownFields): NoPackageResponse =
      NoPackageResponse(unknownFields)

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<NoPackageResponse> = object : ProtoAdapter<NoPackageResponse>(
      FieldEncoding.LENGTH_DELIMITED, 
      NoPackageResponse::class, 
      "type.googleapis.com/NoPackageResponse", 
      PROTO_2, 
      null, 
      "service_without_package.proto"
    ) {
      override fun encodedSize(`value`: NoPackageResponse): Int {
        var size = value.unknownFields.size
        return size
      }

      override fun encode(writer: ProtoWriter, `value`: NoPackageResponse) {
        writer.writeBytes(value.unknownFields)
      }

      override fun encode(writer: ReverseProtoWriter, `value`: NoPackageResponse) {
        writer.writeBytes(value.unknownFields)
      }

      override fun decode(reader: ProtoReader): NoPackageResponse {
        val unknownFields = reader.forEachTag(reader::readUnknownField)
        return NoPackageResponse(
          unknownFields = unknownFields
        )
      }

      override fun redact(`value`: NoPackageResponse): NoPackageResponse = value.copy(
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }
}
