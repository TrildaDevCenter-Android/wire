// Code generated by Wire protocol buffer compiler, do not edit.
// Source: squareup.protos.kotlin.NoFields in no_fields.proto
import Foundation
import Wire

public struct NoFields {

    public var unknownFields: Foundation.Data = .init()

    public init() {
    }

}

#if !WIRE_REMOVE_EQUATABLE
extension NoFields : Equatable {
}
#endif

#if !WIRE_REMOVE_HASHABLE
extension NoFields : Hashable {
}
#endif

#if swift(>=5.5)
extension NoFields : Sendable {
}
#endif

extension NoFields : ProtoDefaultedValue {

    public static var defaultedValue: NoFields {
        NoFields()
    }
}

extension NoFields : ProtoMessage {

    public static func protoMessageTypeURL() -> Swift.String {
        return "type.googleapis.com/squareup.protos.kotlin.NoFields"
    }

}

extension NoFields : Proto2Codable {

    public init(from protoReader: Wire.ProtoReader) throws {
        let token = try protoReader.beginMessage()
        while let tag = try protoReader.nextTag(token: token) {
            switch tag {
            default: try protoReader.readUnknownField(tag: tag)
            }
        }
        self.unknownFields = try protoReader.endMessage(token: token)

    }

    public func encode(to protoWriter: Wire.ProtoWriter) throws {
        try protoWriter.writeUnknownFields(unknownFields)
    }

}

#if !WIRE_REMOVE_CODABLE
extension NoFields : Codable {

    public enum CodingKeys : Swift.CodingKey {
    }

}
#endif