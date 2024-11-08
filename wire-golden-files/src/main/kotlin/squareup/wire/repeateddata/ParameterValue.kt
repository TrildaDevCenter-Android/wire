// Code generated by Wire protocol buffer compiler, do not edit.
// Source: squareup.wire.repeateddata.ParameterValue in squareup/wire/repeated_data.proto
@file:Suppress(
  "DEPRECATION",
  "RUNTIME_ANNOTATION_NOT_SUPPORTED",
)

package squareup.wire.repeateddata

import com.squareup.wire.FieldEncoding
import com.squareup.wire.Message
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.ProtoReader
import com.squareup.wire.ProtoWriter
import com.squareup.wire.ReverseProtoWriter
import com.squareup.wire.Syntax.PROTO_2
import com.squareup.wire.WireField
import com.squareup.wire.`internal`.JvmField
import com.squareup.wire.`internal`.immutableCopyOf
import kotlin.Any
import kotlin.AssertionError
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.DeprecationLevel
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Nothing
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List
import okio.ByteString

public class ParameterValue(
  data_: List<Float> = emptyList(),
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<ParameterValue, Nothing>(ADAPTER, unknownFields) {
  @field:WireField(
    tag = 1,
    adapter = "com.squareup.wire.ProtoAdapter#FLOAT",
    label = WireField.Label.PACKED,
    declaredName = "data",
    schemaIndex = 0,
  )
  public val data_: List<Float> = immutableCopyOf("data_", data_)

  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN,
  )
  override fun newBuilder(): Nothing = throw AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is ParameterValue) return false
    if (unknownFields != other.unknownFields) return false
    if (data_ != other.data_) return false
    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + data_.hashCode()
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    if (data_.isNotEmpty()) result += """data_=$data_"""
    return result.joinToString(prefix = "ParameterValue{", separator = ", ", postfix = "}")
  }

  public fun copy(data_: List<Float> = this.data_, unknownFields: ByteString = this.unknownFields): ParameterValue = ParameterValue(data_, unknownFields)

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<ParameterValue> = object : ProtoAdapter<ParameterValue>(
      FieldEncoding.LENGTH_DELIMITED, 
      ParameterValue::class, 
      "type.googleapis.com/squareup.wire.repeateddata.ParameterValue", 
      PROTO_2, 
      null, 
      "squareup/wire/repeated_data.proto"
    ) {
      override fun encodedSize(`value`: ParameterValue): Int {
        var size = value.unknownFields.size
        size += ProtoAdapter.FLOAT.asPacked().encodedSizeWithTag(1, value.data_)
        return size
      }

      override fun encode(writer: ProtoWriter, `value`: ParameterValue) {
        ProtoAdapter.FLOAT.asPacked().encodeWithTag(writer, 1, value.data_)
        writer.writeBytes(value.unknownFields)
      }

      override fun encode(writer: ReverseProtoWriter, `value`: ParameterValue) {
        writer.writeBytes(value.unknownFields)
        ProtoAdapter.FLOAT.asPacked().encodeWithTag(writer, 1, value.data_)
      }

      override fun decode(reader: ProtoReader): ParameterValue {
        var data_: MutableList<Float>? = null
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> {
              if (data_ == null) {
                val minimumByteSize = 4
                val initialCapacity = (reader.nextFieldMinLengthInBytes() / minimumByteSize)
                  .coerceAtMost(Int.MAX_VALUE.toLong())
                  .toInt()
                data_ = ArrayList(initialCapacity)
              }
              data_!!.add(ProtoAdapter.FLOAT.decode(reader))
            }
            else -> reader.readUnknownField(tag)
          }
        }
        return ParameterValue(
          data_ = data_ ?: listOf(),
          unknownFields = unknownFields
        )
      }

      override fun redact(`value`: ParameterValue): ParameterValue = value.copy(
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }
}
