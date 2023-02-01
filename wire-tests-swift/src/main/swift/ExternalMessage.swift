// Code generated by Wire protocol buffer compiler, do not edit.
// Source: squareup.protos.kotlin.simple.ExternalMessage in external_message.proto
import Foundation
import Wire

public struct ExternalMessage {

    public var f: Float?
    public var unknownFields: Data = .init()

    public init(f: Float? = nil) {
        self.f = f
    }

}

#if !WIRE_REMOVE_EQUATABLE
extension ExternalMessage : Equatable {
}
#endif

#if !WIRE_REMOVE_HASHABLE
extension ExternalMessage : Hashable {
}
#endif

#if swift(>=5.5)
extension ExternalMessage : Sendable {
}
#endif

extension ExternalMessage : ProtoMessage {
    public static func protoMessageTypeURL() -> String {
        return "type.googleapis.com/squareup.protos.kotlin.simple.ExternalMessage"
    }
}

extension ExternalMessage : Proto2Codable {
    public init(from reader: ProtoReader) throws {
        var f: Float? = nil

        let token = try reader.beginMessage()
        while let tag = try reader.nextTag(token: token) {
            switch tag {
            case 1: f = try reader.decode(Float.self)
            default: try reader.readUnknownField(tag: tag)
            }
        }
        self.unknownFields = try reader.endMessage(token: token)

        self.f = f
    }

    public func encode(to writer: ProtoWriter) throws {
        try writer.encode(tag: 1, value: self.f)
        try writer.writeUnknownFields(unknownFields)
    }
}

#if !WIRE_REMOVE_CODABLE
extension ExternalMessage : Codable {
    public init(from decoder: Decoder) throws {
        let container = try decoder.container(keyedBy: StringLiteralCodingKeys.self)
        self.f = try container.decodeIfPresent(Float.self, forKey: "f")
    }

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: StringLiteralCodingKeys.self)

        try container.encodeIfPresent(self.f, forKey: "f")
    }
}
#endif