// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: compiler/ir/serialization.common/src/KotlinIr.proto

package org.jetbrains.kotlin.backend.common.serialization.proto;

/**
 * Protobuf type {@code org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeProjection}
 */
public final class IrTypeProjection extends
    org.jetbrains.kotlin.protobuf.GeneratedMessageLite implements
    // @@protoc_insertion_point(message_implements:org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeProjection)
    IrTypeProjectionOrBuilder {
  // Use IrTypeProjection.newBuilder() to construct.
  private IrTypeProjection(org.jetbrains.kotlin.protobuf.GeneratedMessageLite.Builder builder) {
    super(builder);
    this.unknownFields = builder.getUnknownFields();
  }
  private IrTypeProjection(boolean noInit) { this.unknownFields = org.jetbrains.kotlin.protobuf.ByteString.EMPTY;}

  private static final IrTypeProjection defaultInstance;
  public static IrTypeProjection getDefaultInstance() {
    return defaultInstance;
  }

  public IrTypeProjection getDefaultInstanceForType() {
    return defaultInstance;
  }

  private final org.jetbrains.kotlin.protobuf.ByteString unknownFields;
  private IrTypeProjection(
      org.jetbrains.kotlin.protobuf.CodedInputStream input,
      org.jetbrains.kotlin.protobuf.ExtensionRegistryLite extensionRegistry)
      throws org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException {
    initFields();
    int mutable_bitField0_ = 0;
    org.jetbrains.kotlin.protobuf.ByteString.Output unknownFieldsOutput =
        org.jetbrains.kotlin.protobuf.ByteString.newOutput();
    org.jetbrains.kotlin.protobuf.CodedOutputStream unknownFieldsCodedOutput =
        org.jetbrains.kotlin.protobuf.CodedOutputStream.newInstance(
            unknownFieldsOutput);
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownField(input, unknownFieldsCodedOutput,
                                   extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 8: {
            int rawValue = input.readEnum();
            org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeVariance value = org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeVariance.valueOf(rawValue);
            if (value == null) {
              unknownFieldsCodedOutput.writeRawVarint32(tag);
              unknownFieldsCodedOutput.writeRawVarint32(rawValue);
            } else {
              bitField0_ |= 0x00000001;
              variance_ = value;
            }
            break;
          }
          case 18: {
            org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeIndex.Builder subBuilder = null;
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
              subBuilder = type_.toBuilder();
            }
            type_ = input.readMessage(org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeIndex.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(type_);
              type_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000002;
            break;
          }
        }
      }
    } catch (org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException(
          e.getMessage()).setUnfinishedMessage(this);
    } finally {
      try {
        unknownFieldsCodedOutput.flush();
      } catch (java.io.IOException e) {
      // Should not happen
      } finally {
        unknownFields = unknownFieldsOutput.toByteString();
      }
      makeExtensionsImmutable();
    }
  }
  public static org.jetbrains.kotlin.protobuf.Parser<IrTypeProjection> PARSER =
      new org.jetbrains.kotlin.protobuf.AbstractParser<IrTypeProjection>() {
    public IrTypeProjection parsePartialFrom(
        org.jetbrains.kotlin.protobuf.CodedInputStream input,
        org.jetbrains.kotlin.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException {
      return new IrTypeProjection(input, extensionRegistry);
    }
  };

  @java.lang.Override
  public org.jetbrains.kotlin.protobuf.Parser<IrTypeProjection> getParserForType() {
    return PARSER;
  }

  private int bitField0_;
  public static final int VARIANCE_FIELD_NUMBER = 1;
  private org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeVariance variance_;
  /**
   * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeVariance variance = 1;</code>
   */
  public boolean hasVariance() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeVariance variance = 1;</code>
   */
  public org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeVariance getVariance() {
    return variance_;
  }

  public static final int TYPE_FIELD_NUMBER = 2;
  private org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeIndex type_;
  /**
   * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeIndex type = 2;</code>
   */
  public boolean hasType() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeIndex type = 2;</code>
   */
  public org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeIndex getType() {
    return type_;
  }

  private void initFields() {
    variance_ = org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeVariance.IN;
    type_ = org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeIndex.getDefaultInstance();
  }
  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    if (!hasVariance()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (!hasType()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (!getType().isInitialized()) {
      memoizedIsInitialized = 0;
      return false;
    }
    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(org.jetbrains.kotlin.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    getSerializedSize();
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeEnum(1, variance_.getNumber());
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeMessage(2, type_);
    }
    output.writeRawBytes(unknownFields);
  }

  private int memoizedSerializedSize = -1;
  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += org.jetbrains.kotlin.protobuf.CodedOutputStream
        .computeEnumSize(1, variance_.getNumber());
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += org.jetbrains.kotlin.protobuf.CodedOutputStream
        .computeMessageSize(2, type_);
    }
    size += unknownFields.size();
    memoizedSerializedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  protected java.lang.Object writeReplace()
      throws java.io.ObjectStreamException {
    return super.writeReplace();
  }

  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeProjection parseFrom(
      org.jetbrains.kotlin.protobuf.ByteString data)
      throws org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeProjection parseFrom(
      org.jetbrains.kotlin.protobuf.ByteString data,
      org.jetbrains.kotlin.protobuf.ExtensionRegistryLite extensionRegistry)
      throws org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeProjection parseFrom(byte[] data)
      throws org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeProjection parseFrom(
      byte[] data,
      org.jetbrains.kotlin.protobuf.ExtensionRegistryLite extensionRegistry)
      throws org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeProjection parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeProjection parseFrom(
      java.io.InputStream input,
      org.jetbrains.kotlin.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeProjection parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeProjection parseDelimitedFrom(
      java.io.InputStream input,
      org.jetbrains.kotlin.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeProjection parseFrom(
      org.jetbrains.kotlin.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeProjection parseFrom(
      org.jetbrains.kotlin.protobuf.CodedInputStream input,
      org.jetbrains.kotlin.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public static Builder newBuilder() { return Builder.create(); }
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder(org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeProjection prototype) {
    return newBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() { return newBuilder(this); }

  /**
   * Protobuf type {@code org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeProjection}
   */
  public static final class Builder extends
      org.jetbrains.kotlin.protobuf.GeneratedMessageLite.Builder<
        org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeProjection, Builder>
      implements
      // @@protoc_insertion_point(builder_implements:org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeProjection)
      org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeProjectionOrBuilder {
    // Construct using org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeProjection.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
    }
    private static Builder create() {
      return new Builder();
    }

    public Builder clear() {
      super.clear();
      variance_ = org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeVariance.IN;
      bitField0_ = (bitField0_ & ~0x00000001);
      type_ = org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeIndex.getDefaultInstance();
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    public Builder clone() {
      return create().mergeFrom(buildPartial());
    }

    public org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeProjection getDefaultInstanceForType() {
      return org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeProjection.getDefaultInstance();
    }

    public org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeProjection build() {
      org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeProjection result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeProjection buildPartial() {
      org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeProjection result = new org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeProjection(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      result.variance_ = variance_;
      if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
        to_bitField0_ |= 0x00000002;
      }
      result.type_ = type_;
      result.bitField0_ = to_bitField0_;
      return result;
    }

    public Builder mergeFrom(org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeProjection other) {
      if (other == org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeProjection.getDefaultInstance()) return this;
      if (other.hasVariance()) {
        setVariance(other.getVariance());
      }
      if (other.hasType()) {
        mergeType(other.getType());
      }
      setUnknownFields(
          getUnknownFields().concat(other.unknownFields));
      return this;
    }

    public final boolean isInitialized() {
      if (!hasVariance()) {
        
        return false;
      }
      if (!hasType()) {
        
        return false;
      }
      if (!getType().isInitialized()) {
        
        return false;
      }
      return true;
    }

    public Builder mergeFrom(
        org.jetbrains.kotlin.protobuf.CodedInputStream input,
        org.jetbrains.kotlin.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeProjection parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeProjection) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeVariance variance_ = org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeVariance.IN;
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeVariance variance = 1;</code>
     */
    public boolean hasVariance() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeVariance variance = 1;</code>
     */
    public org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeVariance getVariance() {
      return variance_;
    }
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeVariance variance = 1;</code>
     */
    public Builder setVariance(org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeVariance value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      variance_ = value;
      
      return this;
    }
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeVariance variance = 1;</code>
     */
    public Builder clearVariance() {
      bitField0_ = (bitField0_ & ~0x00000001);
      variance_ = org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeVariance.IN;
      
      return this;
    }

    private org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeIndex type_ = org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeIndex.getDefaultInstance();
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeIndex type = 2;</code>
     */
    public boolean hasType() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeIndex type = 2;</code>
     */
    public org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeIndex getType() {
      return type_;
    }
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeIndex type = 2;</code>
     */
    public Builder setType(org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeIndex value) {
      if (value == null) {
        throw new NullPointerException();
      }
      type_ = value;

      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeIndex type = 2;</code>
     */
    public Builder setType(
        org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeIndex.Builder builderForValue) {
      type_ = builderForValue.build();

      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeIndex type = 2;</code>
     */
    public Builder mergeType(org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeIndex value) {
      if (((bitField0_ & 0x00000002) == 0x00000002) &&
          type_ != org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeIndex.getDefaultInstance()) {
        type_ =
          org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeIndex.newBuilder(type_).mergeFrom(value).buildPartial();
      } else {
        type_ = value;
      }

      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeIndex type = 2;</code>
     */
    public Builder clearType() {
      type_ = org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeIndex.getDefaultInstance();

      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeProjection)
  }

  static {
    defaultInstance = new IrTypeProjection(true);
    defaultInstance.initFields();
  }

  // @@protoc_insertion_point(class_scope:org.jetbrains.kotlin.backend.common.serialization.proto.IrTypeProjection)
}
