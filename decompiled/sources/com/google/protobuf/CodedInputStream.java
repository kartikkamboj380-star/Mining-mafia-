package com.google.protobuf;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class CodedInputStream {
    private static final int DEFAULT_BUFFER_SIZE = 4096;
    private static final int DEFAULT_SIZE_LIMIT = Integer.MAX_VALUE;
    private static volatile int defaultRecursionLimit = 100;
    int recursionDepth;
    int recursionLimit;
    private boolean shouldDiscardUnknownFields;
    int sizeLimit;
    C6748f wrapper;

    private static final class b extends CodedInputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final byte[] f40984a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f40985b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f40986c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f40987d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f40988e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f40989f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f40990g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f40991h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f40992i;

        private void a() {
            int i10 = this.f40986c + this.f40987d;
            this.f40986c = i10;
            int i11 = i10 - this.f40989f;
            int i12 = this.f40992i;
            if (i11 <= i12) {
                this.f40987d = 0;
                return;
            }
            int i13 = i11 - i12;
            this.f40987d = i13;
            this.f40986c = i10 - i13;
        }

        private void b() throws InvalidProtocolBufferException {
            if (this.f40986c - this.f40988e >= 10) {
                c();
            } else {
                d();
            }
        }

        private void c() throws InvalidProtocolBufferException {
            for (int i10 = 0; i10 < 10; i10++) {
                byte[] bArr = this.f40984a;
                int i11 = this.f40988e;
                this.f40988e = i11 + 1;
                if (bArr[i11] >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        private void d() throws InvalidProtocolBufferException {
            for (int i10 = 0; i10 < 10; i10++) {
                if (readRawByte() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // com.google.protobuf.CodedInputStream
        public void checkLastTagWas(int i10) throws InvalidProtocolBufferException {
            if (this.f40990g != i10) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        @Override // com.google.protobuf.CodedInputStream
        public void enableAliasing(boolean z9) {
            this.f40991h = z9;
        }

        @Override // com.google.protobuf.CodedInputStream
        public int getBytesUntilLimit() {
            int i10 = this.f40992i;
            if (i10 == Integer.MAX_VALUE) {
                return -1;
            }
            return i10 - getTotalBytesRead();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int getLastTag() {
            return this.f40990g;
        }

        @Override // com.google.protobuf.CodedInputStream
        public int getTotalBytesRead() {
            return this.f40988e - this.f40989f;
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean isAtEnd() {
            return this.f40988e == this.f40986c;
        }

        @Override // com.google.protobuf.CodedInputStream
        public void popLimit(int i10) {
            this.f40992i = i10;
            a();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int pushLimit(int i10) throws InvalidProtocolBufferException {
            if (i10 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int totalBytesRead = i10 + getTotalBytesRead();
            if (totalBytesRead < 0) {
                throw InvalidProtocolBufferException.parseFailure();
            }
            int i11 = this.f40992i;
            if (totalBytesRead > i11) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.f40992i = totalBytesRead;
            a();
            return i11;
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean readBool() {
            return readRawVarint64() != 0;
        }

        @Override // com.google.protobuf.CodedInputStream
        public byte[] readByteArray() {
            return readRawBytes(readRawVarint32());
        }

        @Override // com.google.protobuf.CodedInputStream
        public ByteBuffer readByteBuffer() throws InvalidProtocolBufferException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                int i10 = this.f40986c;
                int i11 = this.f40988e;
                if (rawVarint32 <= i10 - i11) {
                    ByteBuffer byteBufferWrap = (this.f40985b || !this.f40991h) ? ByteBuffer.wrap(Arrays.copyOfRange(this.f40984a, i11, i11 + rawVarint32)) : ByteBuffer.wrap(this.f40984a, i11, rawVarint32).slice();
                    this.f40988e += rawVarint32;
                    return byteBufferWrap;
                }
            }
            if (rawVarint32 == 0) {
                return Internal.EMPTY_BYTE_BUFFER;
            }
            if (rawVarint32 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.protobuf.CodedInputStream
        public ByteString readBytes() {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                int i10 = this.f40986c;
                int i11 = this.f40988e;
                if (rawVarint32 <= i10 - i11) {
                    ByteString byteStringWrap = (this.f40985b && this.f40991h) ? ByteString.wrap(this.f40984a, i11, rawVarint32) : ByteString.copyFrom(this.f40984a, i11, rawVarint32);
                    this.f40988e += rawVarint32;
                    return byteStringWrap;
                }
            }
            return rawVarint32 == 0 ? ByteString.EMPTY : ByteString.wrap(readRawBytes(rawVarint32));
        }

        @Override // com.google.protobuf.CodedInputStream
        public double readDouble() {
            return Double.longBitsToDouble(readRawLittleEndian64());
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readEnum() {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readFixed32() {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readFixed64() {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public float readFloat() {
            return Float.intBitsToFloat(readRawLittleEndian32());
        }

        @Override // com.google.protobuf.CodedInputStream
        public void readGroup(int i10, MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            checkRecursionLimit();
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(WireFormat.makeTag(i10, 4));
            this.recursionDepth--;
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readInt32() {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readInt64() {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public void readMessage(MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() != 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            popLimit(iPushLimit);
        }

        @Override // com.google.protobuf.CodedInputStream
        public byte readRawByte() throws InvalidProtocolBufferException {
            int i10 = this.f40988e;
            if (i10 == this.f40986c) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = this.f40984a;
            this.f40988e = i10 + 1;
            return bArr[i10];
        }

        @Override // com.google.protobuf.CodedInputStream
        public byte[] readRawBytes(int i10) throws InvalidProtocolBufferException {
            if (i10 > 0) {
                int i11 = this.f40986c;
                int i12 = this.f40988e;
                if (i10 <= i11 - i12) {
                    int i13 = i10 + i12;
                    this.f40988e = i13;
                    return Arrays.copyOfRange(this.f40984a, i12, i13);
                }
            }
            if (i10 > 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (i10 == 0) {
                return Internal.EMPTY_BYTE_ARRAY;
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readRawLittleEndian32() throws InvalidProtocolBufferException {
            int i10 = this.f40988e;
            if (this.f40986c - i10 < 4) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = this.f40984a;
            this.f40988e = i10 + 4;
            return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readRawLittleEndian64() throws InvalidProtocolBufferException {
            int i10 = this.f40988e;
            if (this.f40986c - i10 < 8) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = this.f40984a;
            this.f40988e = i10 + 8;
            return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readRawVarint32() {
            int i10;
            int i11 = this.f40988e;
            int i12 = this.f40986c;
            if (i12 != i11) {
                byte[] bArr = this.f40984a;
                int i13 = i11 + 1;
                byte b10 = bArr[i11];
                if (b10 >= 0) {
                    this.f40988e = i13;
                    return b10;
                }
                if (i12 - i13 >= 9) {
                    int i14 = i11 + 2;
                    int i15 = (bArr[i13] << 7) ^ b10;
                    if (i15 < 0) {
                        i10 = i15 ^ (-128);
                    } else {
                        int i16 = i11 + 3;
                        int i17 = (bArr[i14] << 14) ^ i15;
                        if (i17 >= 0) {
                            i10 = i17 ^ 16256;
                        } else {
                            int i18 = i11 + 4;
                            int i19 = i17 ^ (bArr[i16] << 21);
                            if (i19 < 0) {
                                i10 = (-2080896) ^ i19;
                            } else {
                                i16 = i11 + 5;
                                byte b11 = bArr[i18];
                                int i20 = (i19 ^ (b11 << 28)) ^ 266354560;
                                if (b11 < 0) {
                                    i18 = i11 + 6;
                                    if (bArr[i16] < 0) {
                                        i16 = i11 + 7;
                                        if (bArr[i18] < 0) {
                                            i18 = i11 + 8;
                                            if (bArr[i16] < 0) {
                                                i16 = i11 + 9;
                                                if (bArr[i18] < 0) {
                                                    int i21 = i11 + 10;
                                                    if (bArr[i16] >= 0) {
                                                        i14 = i21;
                                                        i10 = i20;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i10 = i20;
                                }
                                i10 = i20;
                            }
                            i14 = i18;
                        }
                        i14 = i16;
                    }
                    this.f40988e = i14;
                    return i10;
                }
            }
            return (int) readRawVarint64SlowPath();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readRawVarint64() {
            long j10;
            long j11;
            long j12;
            int i10 = this.f40988e;
            int i11 = this.f40986c;
            if (i11 != i10) {
                byte[] bArr = this.f40984a;
                int i12 = i10 + 1;
                byte b10 = bArr[i10];
                if (b10 >= 0) {
                    this.f40988e = i12;
                    return b10;
                }
                if (i11 - i12 >= 9) {
                    int i13 = i10 + 2;
                    int i14 = (bArr[i12] << 7) ^ b10;
                    if (i14 < 0) {
                        j10 = i14 ^ (-128);
                    } else {
                        int i15 = i10 + 3;
                        int i16 = (bArr[i13] << 14) ^ i14;
                        if (i16 >= 0) {
                            j10 = i16 ^ 16256;
                            i13 = i15;
                        } else {
                            int i17 = i10 + 4;
                            int i18 = i16 ^ (bArr[i15] << 21);
                            if (i18 < 0) {
                                long j13 = (-2080896) ^ i18;
                                i13 = i17;
                                j10 = j13;
                            } else {
                                long j14 = i18;
                                i13 = i10 + 5;
                                long j15 = j14 ^ (((long) bArr[i17]) << 28);
                                if (j15 >= 0) {
                                    j12 = 266354560;
                                } else {
                                    int i19 = i10 + 6;
                                    long j16 = j15 ^ (((long) bArr[i13]) << 35);
                                    if (j16 < 0) {
                                        j11 = -34093383808L;
                                    } else {
                                        i13 = i10 + 7;
                                        j15 = j16 ^ (((long) bArr[i19]) << 42);
                                        if (j15 >= 0) {
                                            j12 = 4363953127296L;
                                        } else {
                                            i19 = i10 + 8;
                                            j16 = j15 ^ (((long) bArr[i13]) << 49);
                                            if (j16 < 0) {
                                                j11 = -558586000294016L;
                                            } else {
                                                i13 = i10 + 9;
                                                long j17 = (j16 ^ (((long) bArr[i19]) << 56)) ^ 71499008037633920L;
                                                if (j17 < 0) {
                                                    int i20 = i10 + 10;
                                                    if (bArr[i13] >= 0) {
                                                        i13 = i20;
                                                    }
                                                }
                                                j10 = j17;
                                            }
                                        }
                                    }
                                    j10 = j16 ^ j11;
                                    i13 = i19;
                                }
                                j10 = j15 ^ j12;
                            }
                        }
                    }
                    this.f40988e = i13;
                    return j10;
                }
            }
            return readRawVarint64SlowPath();
        }

        @Override // com.google.protobuf.CodedInputStream
        long readRawVarint64SlowPath() throws InvalidProtocolBufferException {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte rawByte = readRawByte();
                j10 |= ((long) (rawByte & 127)) << i10;
                if ((rawByte & 128) == 0) {
                    return j10;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readSFixed32() {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readSFixed64() {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readSInt32() {
            return CodedInputStream.decodeZigZag32(readRawVarint32());
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readSInt64() {
            return CodedInputStream.decodeZigZag64(readRawVarint64());
        }

        @Override // com.google.protobuf.CodedInputStream
        public String readString() throws InvalidProtocolBufferException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                int i10 = this.f40986c;
                int i11 = this.f40988e;
                if (rawVarint32 <= i10 - i11) {
                    String str = new String(this.f40984a, i11, rawVarint32, Internal.UTF_8);
                    this.f40988e += rawVarint32;
                    return str;
                }
            }
            if (rawVarint32 == 0) {
                return "";
            }
            if (rawVarint32 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.protobuf.CodedInputStream
        public String readStringRequireUtf8() throws InvalidProtocolBufferException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                int i10 = this.f40986c;
                int i11 = this.f40988e;
                if (rawVarint32 <= i10 - i11) {
                    String strH = W.h(this.f40984a, i11, rawVarint32);
                    this.f40988e += rawVarint32;
                    return strH;
                }
            }
            if (rawVarint32 == 0) {
                return "";
            }
            if (rawVarint32 <= 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readTag() throws InvalidProtocolBufferException {
            if (isAtEnd()) {
                this.f40990g = 0;
                return 0;
            }
            int rawVarint32 = readRawVarint32();
            this.f40990g = rawVarint32;
            if (WireFormat.getTagFieldNumber(rawVarint32) != 0) {
                return this.f40990g;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readUInt32() {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readUInt64() {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public void readUnknownGroup(int i10, MessageLite.Builder builder) throws InvalidProtocolBufferException {
            readGroup(i10, builder, ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // com.google.protobuf.CodedInputStream
        public void resetSizeCounter() {
            this.f40989f = this.f40988e;
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean skipField(int i10) throws InvalidProtocolBufferException {
            int tagWireType = WireFormat.getTagWireType(i10);
            if (tagWireType == 0) {
                b();
                return true;
            }
            if (tagWireType == 1) {
                skipRawBytes(8);
                return true;
            }
            if (tagWireType == 2) {
                skipRawBytes(readRawVarint32());
                return true;
            }
            if (tagWireType == 3) {
                skipMessage();
                checkLastTagWas(WireFormat.makeTag(WireFormat.getTagFieldNumber(i10), 4));
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            skipRawBytes(4);
            return true;
        }

        @Override // com.google.protobuf.CodedInputStream
        public void skipRawBytes(int i10) throws InvalidProtocolBufferException {
            if (i10 >= 0) {
                int i11 = this.f40986c;
                int i12 = this.f40988e;
                if (i10 <= i11 - i12) {
                    this.f40988e = i12 + i10;
                    return;
                }
            }
            if (i10 >= 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        private b(byte[] bArr, int i10, int i11, boolean z9) {
            super();
            this.f40992i = Integer.MAX_VALUE;
            this.f40984a = bArr;
            this.f40986c = i11 + i10;
            this.f40988e = i10;
            this.f40989f = i10;
            this.f40985b = z9;
        }

        @Override // com.google.protobuf.CodedInputStream
        public MessageLite readGroup(int i10, Parser parser, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            checkRecursionLimit();
            this.recursionDepth++;
            MessageLite messageLite = (MessageLite) parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(WireFormat.makeTag(i10, 4));
            this.recursionDepth--;
            return messageLite;
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean skipField(int i10, CodedOutputStream codedOutputStream) throws InvalidProtocolBufferException {
            int tagWireType = WireFormat.getTagWireType(i10);
            if (tagWireType == 0) {
                long int64 = readInt64();
                codedOutputStream.writeUInt32NoTag(i10);
                codedOutputStream.writeUInt64NoTag(int64);
                return true;
            }
            if (tagWireType == 1) {
                long rawLittleEndian64 = readRawLittleEndian64();
                codedOutputStream.writeUInt32NoTag(i10);
                codedOutputStream.writeFixed64NoTag(rawLittleEndian64);
                return true;
            }
            if (tagWireType == 2) {
                ByteString bytes = readBytes();
                codedOutputStream.writeUInt32NoTag(i10);
                codedOutputStream.writeBytesNoTag(bytes);
                return true;
            }
            if (tagWireType == 3) {
                codedOutputStream.writeUInt32NoTag(i10);
                skipMessage(codedOutputStream);
                int iMakeTag = WireFormat.makeTag(WireFormat.getTagFieldNumber(i10), 4);
                checkLastTagWas(iMakeTag);
                codedOutputStream.writeUInt32NoTag(iMakeTag);
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType == 5) {
                int rawLittleEndian32 = readRawLittleEndian32();
                codedOutputStream.writeUInt32NoTag(i10);
                codedOutputStream.writeFixed32NoTag(rawLittleEndian32);
                return true;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }

        @Override // com.google.protobuf.CodedInputStream
        public MessageLite readMessage(Parser parser, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.recursionDepth++;
            MessageLite messageLite = (MessageLite) parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() == 0) {
                popLimit(iPushLimit);
                return messageLite;
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    private static final class c extends CodedInputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Iterable f40993a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Iterator f40994b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ByteBuffer f40995c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f40996d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f40997e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f40998f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f40999g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f41000h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f41001i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f41002j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f41003k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private long f41004l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private long f41005m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private long f41006n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private long f41007o;

        private long a() {
            return this.f41007o - this.f41004l;
        }

        private void b() throws InvalidProtocolBufferException {
            if (!this.f40994b.hasNext()) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            h();
        }

        private void c(byte[] bArr, int i10, int i11) throws InvalidProtocolBufferException {
            if (i11 < 0 || i11 > e()) {
                if (i11 > 0) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                if (i11 != 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                return;
            }
            int i12 = i11;
            while (i12 > 0) {
                if (a() == 0) {
                    b();
                }
                int iMin = Math.min(i12, (int) a());
                long j10 = iMin;
                V.p(this.f41004l, bArr, (i11 - i12) + i10, j10);
                i12 -= iMin;
                this.f41004l += j10;
            }
        }

        private void d() {
            int i10 = this.f40998f + this.f40999g;
            this.f40998f = i10;
            int i11 = i10 - this.f41003k;
            int i12 = this.f41000h;
            if (i11 <= i12) {
                this.f40999g = 0;
                return;
            }
            int i13 = i11 - i12;
            this.f40999g = i13;
            this.f40998f = i10 - i13;
        }

        private int e() {
            return (int) ((((long) (this.f40998f - this.f41002j)) - this.f41004l) + this.f41005m);
        }

        private void f() throws InvalidProtocolBufferException {
            for (int i10 = 0; i10 < 10; i10++) {
                if (readRawByte() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        private ByteBuffer g(int i10, int i11) {
            int iPosition = this.f40995c.position();
            int iLimit = this.f40995c.limit();
            ByteBuffer byteBuffer = this.f40995c;
            try {
                try {
                    byteBuffer.position(i10);
                    byteBuffer.limit(i11);
                    ByteBuffer byteBufferSlice = this.f40995c.slice();
                    byteBuffer.position(iPosition);
                    byteBuffer.limit(iLimit);
                    return byteBufferSlice;
                } catch (IllegalArgumentException unused) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
            } catch (Throwable th) {
                byteBuffer.position(iPosition);
                byteBuffer.limit(iLimit);
                throw th;
            }
        }

        private void h() {
            ByteBuffer byteBuffer = (ByteBuffer) this.f40994b.next();
            this.f40995c = byteBuffer;
            this.f41002j += (int) (this.f41004l - this.f41005m);
            long jPosition = byteBuffer.position();
            this.f41004l = jPosition;
            this.f41005m = jPosition;
            this.f41007o = this.f40995c.limit();
            long jK = V.k(this.f40995c);
            this.f41006n = jK;
            this.f41004l += jK;
            this.f41005m += jK;
            this.f41007o += jK;
        }

        @Override // com.google.protobuf.CodedInputStream
        public void checkLastTagWas(int i10) throws InvalidProtocolBufferException {
            if (this.f41001i != i10) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        @Override // com.google.protobuf.CodedInputStream
        public void enableAliasing(boolean z9) {
            this.f40997e = z9;
        }

        @Override // com.google.protobuf.CodedInputStream
        public int getBytesUntilLimit() {
            int i10 = this.f41000h;
            if (i10 == Integer.MAX_VALUE) {
                return -1;
            }
            return i10 - getTotalBytesRead();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int getLastTag() {
            return this.f41001i;
        }

        @Override // com.google.protobuf.CodedInputStream
        public int getTotalBytesRead() {
            return (int) ((((long) (this.f41002j - this.f41003k)) + this.f41004l) - this.f41005m);
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean isAtEnd() {
            return (((long) this.f41002j) + this.f41004l) - this.f41005m == ((long) this.f40998f);
        }

        @Override // com.google.protobuf.CodedInputStream
        public void popLimit(int i10) {
            this.f41000h = i10;
            d();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int pushLimit(int i10) throws InvalidProtocolBufferException {
            if (i10 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int totalBytesRead = i10 + getTotalBytesRead();
            int i11 = this.f41000h;
            if (totalBytesRead > i11) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.f41000h = totalBytesRead;
            d();
            return i11;
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean readBool() {
            return readRawVarint64() != 0;
        }

        @Override // com.google.protobuf.CodedInputStream
        public byte[] readByteArray() {
            return readRawBytes(readRawVarint32());
        }

        @Override // com.google.protobuf.CodedInputStream
        public ByteBuffer readByteBuffer() throws InvalidProtocolBufferException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                long j10 = rawVarint32;
                if (j10 <= a()) {
                    if (this.f40996d || !this.f40997e) {
                        byte[] bArr = new byte[rawVarint32];
                        V.p(this.f41004l, bArr, 0L, j10);
                        this.f41004l += j10;
                        return ByteBuffer.wrap(bArr);
                    }
                    long j11 = this.f41004l + j10;
                    this.f41004l = j11;
                    long j12 = this.f41006n;
                    return g((int) ((j11 - j12) - j10), (int) (j11 - j12));
                }
            }
            if (rawVarint32 > 0 && rawVarint32 <= e()) {
                byte[] bArr2 = new byte[rawVarint32];
                c(bArr2, 0, rawVarint32);
                return ByteBuffer.wrap(bArr2);
            }
            if (rawVarint32 == 0) {
                return Internal.EMPTY_BYTE_BUFFER;
            }
            if (rawVarint32 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.protobuf.CodedInputStream
        public ByteString readBytes() throws InvalidProtocolBufferException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                long j10 = rawVarint32;
                long j11 = this.f41007o;
                long j12 = this.f41004l;
                if (j10 <= j11 - j12) {
                    if (this.f40996d && this.f40997e) {
                        int i10 = (int) (j12 - this.f41006n);
                        ByteString byteStringWrap = ByteString.wrap(g(i10, rawVarint32 + i10));
                        this.f41004l += j10;
                        return byteStringWrap;
                    }
                    byte[] bArr = new byte[rawVarint32];
                    V.p(j12, bArr, 0L, j10);
                    this.f41004l += j10;
                    return ByteString.wrap(bArr);
                }
            }
            if (rawVarint32 <= 0 || rawVarint32 > e()) {
                if (rawVarint32 == 0) {
                    return ByteString.EMPTY;
                }
                if (rawVarint32 < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (!this.f40996d || !this.f40997e) {
                byte[] bArr2 = new byte[rawVarint32];
                c(bArr2, 0, rawVarint32);
                return ByteString.wrap(bArr2);
            }
            ArrayList arrayList = new ArrayList();
            while (rawVarint32 > 0) {
                if (a() == 0) {
                    b();
                }
                int iMin = Math.min(rawVarint32, (int) a());
                int i11 = (int) (this.f41004l - this.f41006n);
                arrayList.add(ByteString.wrap(g(i11, i11 + iMin)));
                rawVarint32 -= iMin;
                this.f41004l += (long) iMin;
            }
            return ByteString.copyFrom(arrayList);
        }

        @Override // com.google.protobuf.CodedInputStream
        public double readDouble() {
            return Double.longBitsToDouble(readRawLittleEndian64());
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readEnum() {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readFixed32() {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readFixed64() {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public float readFloat() {
            return Float.intBitsToFloat(readRawLittleEndian32());
        }

        @Override // com.google.protobuf.CodedInputStream
        public void readGroup(int i10, MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            checkRecursionLimit();
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(WireFormat.makeTag(i10, 4));
            this.recursionDepth--;
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readInt32() {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readInt64() {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public void readMessage(MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() != 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            popLimit(iPushLimit);
        }

        @Override // com.google.protobuf.CodedInputStream
        public byte readRawByte() throws InvalidProtocolBufferException {
            if (a() == 0) {
                b();
            }
            long j10 = this.f41004l;
            this.f41004l = 1 + j10;
            return V.x(j10);
        }

        @Override // com.google.protobuf.CodedInputStream
        public byte[] readRawBytes(int i10) throws InvalidProtocolBufferException {
            if (i10 >= 0) {
                long j10 = i10;
                if (j10 <= a()) {
                    byte[] bArr = new byte[i10];
                    V.p(this.f41004l, bArr, 0L, j10);
                    this.f41004l += j10;
                    return bArr;
                }
            }
            if (i10 >= 0 && i10 <= e()) {
                byte[] bArr2 = new byte[i10];
                c(bArr2, 0, i10);
                return bArr2;
            }
            if (i10 > 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (i10 == 0) {
                return Internal.EMPTY_BYTE_ARRAY;
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readRawLittleEndian32() {
            if (a() < 4) {
                return (readRawByte() & 255) | ((readRawByte() & 255) << 8) | ((readRawByte() & 255) << 16) | ((readRawByte() & 255) << 24);
            }
            long j10 = this.f41004l;
            this.f41004l = 4 + j10;
            return ((V.x(j10 + 3) & 255) << 24) | (V.x(j10) & 255) | ((V.x(1 + j10) & 255) << 8) | ((V.x(2 + j10) & 255) << 16);
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readRawLittleEndian64() throws InvalidProtocolBufferException {
            char c10;
            long rawByte;
            byte rawByte2;
            if (a() >= 8) {
                long j10 = this.f41004l;
                this.f41004l = 8 + j10;
                c10 = '8';
                rawByte = (((long) V.x(j10)) & 255) | ((((long) V.x(1 + j10)) & 255) << 8) | ((((long) V.x(2 + j10)) & 255) << 16) | ((((long) V.x(3 + j10)) & 255) << 24) | ((((long) V.x(4 + j10)) & 255) << 32) | ((((long) V.x(5 + j10)) & 255) << 40) | ((((long) V.x(6 + j10)) & 255) << 48);
                rawByte2 = V.x(j10 + 7);
            } else {
                c10 = '8';
                rawByte = (((long) readRawByte()) & 255) | ((((long) readRawByte()) & 255) << 8) | ((((long) readRawByte()) & 255) << 16) | ((((long) readRawByte()) & 255) << 24) | ((((long) readRawByte()) & 255) << 32) | ((((long) readRawByte()) & 255) << 40) | ((((long) readRawByte()) & 255) << 48);
                rawByte2 = readRawByte();
            }
            return rawByte | ((((long) rawByte2) & 255) << c10);
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readRawVarint32() {
            int i10;
            long j10 = this.f41004l;
            if (this.f41007o != j10) {
                long j11 = j10 + 1;
                byte bX = V.x(j10);
                if (bX >= 0) {
                    this.f41004l++;
                    return bX;
                }
                if (this.f41007o - this.f41004l >= 10) {
                    long j12 = 2 + j10;
                    int iX = (V.x(j11) << 7) ^ bX;
                    if (iX < 0) {
                        i10 = iX ^ (-128);
                    } else {
                        long j13 = 3 + j10;
                        int iX2 = (V.x(j12) << 14) ^ iX;
                        if (iX2 >= 0) {
                            i10 = iX2 ^ 16256;
                        } else {
                            long j14 = 4 + j10;
                            int iX3 = iX2 ^ (V.x(j13) << 21);
                            if (iX3 < 0) {
                                i10 = (-2080896) ^ iX3;
                            } else {
                                j13 = 5 + j10;
                                byte bX2 = V.x(j14);
                                int i11 = (iX3 ^ (bX2 << 28)) ^ 266354560;
                                if (bX2 < 0) {
                                    j14 = 6 + j10;
                                    if (V.x(j13) < 0) {
                                        j13 = 7 + j10;
                                        if (V.x(j14) < 0) {
                                            j14 = 8 + j10;
                                            if (V.x(j13) < 0) {
                                                j13 = 9 + j10;
                                                if (V.x(j14) < 0) {
                                                    long j15 = j10 + 10;
                                                    if (V.x(j13) >= 0) {
                                                        i10 = i11;
                                                        j12 = j15;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i10 = i11;
                                }
                                i10 = i11;
                            }
                            j12 = j14;
                        }
                        j12 = j13;
                    }
                    this.f41004l = j12;
                    return i10;
                }
            }
            return (int) readRawVarint64SlowPath();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readRawVarint64() {
            long j10;
            long j11;
            long j12;
            long j13 = this.f41004l;
            if (this.f41007o != j13) {
                long j14 = j13 + 1;
                byte bX = V.x(j13);
                if (bX >= 0) {
                    this.f41004l++;
                    return bX;
                }
                if (this.f41007o - this.f41004l >= 10) {
                    long j15 = 2 + j13;
                    int iX = (V.x(j14) << 7) ^ bX;
                    if (iX < 0) {
                        j10 = iX ^ (-128);
                    } else {
                        long j16 = 3 + j13;
                        int iX2 = (V.x(j15) << 14) ^ iX;
                        if (iX2 >= 0) {
                            j10 = iX2 ^ 16256;
                            j15 = j16;
                        } else {
                            long j17 = 4 + j13;
                            int iX3 = iX2 ^ (V.x(j16) << 21);
                            if (iX3 < 0) {
                                j10 = (-2080896) ^ iX3;
                                j15 = j17;
                            } else {
                                long j18 = 5 + j13;
                                long jX = (((long) V.x(j17)) << 28) ^ ((long) iX3);
                                if (jX >= 0) {
                                    j12 = 266354560;
                                } else {
                                    long j19 = 6 + j13;
                                    long jX2 = jX ^ (((long) V.x(j18)) << 35);
                                    if (jX2 < 0) {
                                        j11 = -34093383808L;
                                    } else {
                                        j18 = 7 + j13;
                                        jX = jX2 ^ (((long) V.x(j19)) << 42);
                                        if (jX >= 0) {
                                            j12 = 4363953127296L;
                                        } else {
                                            j19 = 8 + j13;
                                            jX2 = jX ^ (((long) V.x(j18)) << 49);
                                            if (jX2 < 0) {
                                                j11 = -558586000294016L;
                                            } else {
                                                j18 = 9 + j13;
                                                long jX3 = (jX2 ^ (((long) V.x(j19)) << 56)) ^ 71499008037633920L;
                                                if (jX3 < 0) {
                                                    long j20 = j13 + 10;
                                                    if (V.x(j18) >= 0) {
                                                        j15 = j20;
                                                        j10 = jX3;
                                                    }
                                                } else {
                                                    j10 = jX3;
                                                    j15 = j18;
                                                }
                                            }
                                        }
                                    }
                                    j10 = j11 ^ jX2;
                                    j15 = j19;
                                }
                                j10 = j12 ^ jX;
                                j15 = j18;
                            }
                        }
                    }
                    this.f41004l = j15;
                    return j10;
                }
            }
            return readRawVarint64SlowPath();
        }

        @Override // com.google.protobuf.CodedInputStream
        long readRawVarint64SlowPath() throws InvalidProtocolBufferException {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte rawByte = readRawByte();
                j10 |= ((long) (rawByte & 127)) << i10;
                if ((rawByte & 128) == 0) {
                    return j10;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readSFixed32() {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readSFixed64() {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readSInt32() {
            return CodedInputStream.decodeZigZag32(readRawVarint32());
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readSInt64() {
            return CodedInputStream.decodeZigZag64(readRawVarint64());
        }

        @Override // com.google.protobuf.CodedInputStream
        public String readString() throws InvalidProtocolBufferException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                long j10 = rawVarint32;
                long j11 = this.f41007o;
                long j12 = this.f41004l;
                if (j10 <= j11 - j12) {
                    byte[] bArr = new byte[rawVarint32];
                    V.p(j12, bArr, 0L, j10);
                    String str = new String(bArr, Internal.UTF_8);
                    this.f41004l += j10;
                    return str;
                }
            }
            if (rawVarint32 > 0 && rawVarint32 <= e()) {
                byte[] bArr2 = new byte[rawVarint32];
                c(bArr2, 0, rawVarint32);
                return new String(bArr2, Internal.UTF_8);
            }
            if (rawVarint32 == 0) {
                return "";
            }
            if (rawVarint32 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.protobuf.CodedInputStream
        public String readStringRequireUtf8() throws InvalidProtocolBufferException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                long j10 = rawVarint32;
                long j11 = this.f41007o;
                long j12 = this.f41004l;
                if (j10 <= j11 - j12) {
                    String strG = W.g(this.f40995c, (int) (j12 - this.f41005m), rawVarint32);
                    this.f41004l += j10;
                    return strG;
                }
            }
            if (rawVarint32 >= 0 && rawVarint32 <= e()) {
                byte[] bArr = new byte[rawVarint32];
                c(bArr, 0, rawVarint32);
                return W.h(bArr, 0, rawVarint32);
            }
            if (rawVarint32 == 0) {
                return "";
            }
            if (rawVarint32 <= 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readTag() throws InvalidProtocolBufferException {
            if (isAtEnd()) {
                this.f41001i = 0;
                return 0;
            }
            int rawVarint32 = readRawVarint32();
            this.f41001i = rawVarint32;
            if (WireFormat.getTagFieldNumber(rawVarint32) != 0) {
                return this.f41001i;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readUInt32() {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readUInt64() {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public void readUnknownGroup(int i10, MessageLite.Builder builder) throws InvalidProtocolBufferException {
            readGroup(i10, builder, ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // com.google.protobuf.CodedInputStream
        public void resetSizeCounter() {
            this.f41003k = (int) ((((long) this.f41002j) + this.f41004l) - this.f41005m);
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean skipField(int i10) throws InvalidProtocolBufferException {
            int tagWireType = WireFormat.getTagWireType(i10);
            if (tagWireType == 0) {
                f();
                return true;
            }
            if (tagWireType == 1) {
                skipRawBytes(8);
                return true;
            }
            if (tagWireType == 2) {
                skipRawBytes(readRawVarint32());
                return true;
            }
            if (tagWireType == 3) {
                skipMessage();
                checkLastTagWas(WireFormat.makeTag(WireFormat.getTagFieldNumber(i10), 4));
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            skipRawBytes(4);
            return true;
        }

        @Override // com.google.protobuf.CodedInputStream
        public void skipRawBytes(int i10) throws InvalidProtocolBufferException {
            if (i10 < 0 || i10 > (((long) (this.f40998f - this.f41002j)) - this.f41004l) + this.f41005m) {
                if (i10 >= 0) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                throw InvalidProtocolBufferException.negativeSize();
            }
            while (i10 > 0) {
                if (a() == 0) {
                    b();
                }
                int iMin = Math.min(i10, (int) a());
                i10 -= iMin;
                this.f41004l += (long) iMin;
            }
        }

        private c(Iterable iterable, int i10, boolean z9) {
            super();
            this.f41000h = Integer.MAX_VALUE;
            this.f40998f = i10;
            this.f40993a = iterable;
            this.f40994b = iterable.iterator();
            this.f40996d = z9;
            this.f41002j = 0;
            this.f41003k = 0;
            if (i10 != 0) {
                h();
                return;
            }
            this.f40995c = Internal.EMPTY_BYTE_BUFFER;
            this.f41004l = 0L;
            this.f41005m = 0L;
            this.f41007o = 0L;
            this.f41006n = 0L;
        }

        @Override // com.google.protobuf.CodedInputStream
        public MessageLite readGroup(int i10, Parser parser, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            checkRecursionLimit();
            this.recursionDepth++;
            MessageLite messageLite = (MessageLite) parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(WireFormat.makeTag(i10, 4));
            this.recursionDepth--;
            return messageLite;
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean skipField(int i10, CodedOutputStream codedOutputStream) throws InvalidProtocolBufferException {
            int tagWireType = WireFormat.getTagWireType(i10);
            if (tagWireType == 0) {
                long int64 = readInt64();
                codedOutputStream.writeUInt32NoTag(i10);
                codedOutputStream.writeUInt64NoTag(int64);
                return true;
            }
            if (tagWireType == 1) {
                long rawLittleEndian64 = readRawLittleEndian64();
                codedOutputStream.writeUInt32NoTag(i10);
                codedOutputStream.writeFixed64NoTag(rawLittleEndian64);
                return true;
            }
            if (tagWireType == 2) {
                ByteString bytes = readBytes();
                codedOutputStream.writeUInt32NoTag(i10);
                codedOutputStream.writeBytesNoTag(bytes);
                return true;
            }
            if (tagWireType == 3) {
                codedOutputStream.writeUInt32NoTag(i10);
                skipMessage(codedOutputStream);
                int iMakeTag = WireFormat.makeTag(WireFormat.getTagFieldNumber(i10), 4);
                checkLastTagWas(iMakeTag);
                codedOutputStream.writeUInt32NoTag(iMakeTag);
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType == 5) {
                int rawLittleEndian32 = readRawLittleEndian32();
                codedOutputStream.writeUInt32NoTag(i10);
                codedOutputStream.writeFixed32NoTag(rawLittleEndian32);
                return true;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }

        @Override // com.google.protobuf.CodedInputStream
        public MessageLite readMessage(Parser parser, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.recursionDepth++;
            MessageLite messageLite = (MessageLite) parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() == 0) {
                popLimit(iPushLimit);
                return messageLite;
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    private static final class d extends CodedInputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InputStream f41008a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final byte[] f41009b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f41010c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f41011d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f41012e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f41013f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f41014g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f41015h;

        private static int a(InputStream inputStream) throws InvalidProtocolBufferException {
            try {
                return inputStream.available();
            } catch (InvalidProtocolBufferException e10) {
                e10.setThrownFromInputStream();
                throw e10;
            }
        }

        private static int b(InputStream inputStream, byte[] bArr, int i10, int i11) throws InvalidProtocolBufferException {
            try {
                return inputStream.read(bArr, i10, i11);
            } catch (InvalidProtocolBufferException e10) {
                e10.setThrownFromInputStream();
                throw e10;
            }
        }

        private ByteString c(int i10) throws IOException {
            byte[] bArrE = e(i10);
            if (bArrE != null) {
                return ByteString.copyFrom(bArrE);
            }
            int i11 = this.f41012e;
            int i12 = this.f41010c;
            int length = i12 - i11;
            this.f41014g += i12;
            this.f41012e = 0;
            this.f41010c = 0;
            List<byte[]> listF = f(i10 - length);
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f41009b, i11, bArr, 0, length);
            for (byte[] bArr2 : listF) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return ByteString.wrap(bArr);
        }

        private byte[] d(int i10, boolean z9) throws IOException {
            byte[] bArrE = e(i10);
            if (bArrE != null) {
                return z9 ? (byte[]) bArrE.clone() : bArrE;
            }
            int i11 = this.f41012e;
            int i12 = this.f41010c;
            int length = i12 - i11;
            this.f41014g += i12;
            this.f41012e = 0;
            this.f41010c = 0;
            List<byte[]> listF = f(i10 - length);
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f41009b, i11, bArr, 0, length);
            for (byte[] bArr2 : listF) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return bArr;
        }

        private byte[] e(int i10) throws InvalidProtocolBufferException {
            if (i10 == 0) {
                return Internal.EMPTY_BYTE_ARRAY;
            }
            if (i10 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int i11 = this.f41014g;
            int i12 = this.f41012e;
            int i13 = i11 + i12 + i10;
            if (i13 - this.sizeLimit > 0) {
                throw InvalidProtocolBufferException.sizeLimitExceeded();
            }
            int i14 = this.f41015h;
            if (i13 > i14) {
                skipRawBytes((i14 - i11) - i12);
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            int i15 = this.f41010c - i12;
            int i16 = i10 - i15;
            if (i16 >= 4096 && i16 > a(this.f41008a)) {
                return null;
            }
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f41009b, this.f41012e, bArr, 0, i15);
            this.f41014g += this.f41010c;
            this.f41012e = 0;
            this.f41010c = 0;
            while (i15 < i10) {
                int iB = b(this.f41008a, bArr, i15, i10 - i15);
                if (iB == -1) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                this.f41014g += iB;
                i15 += iB;
            }
            return bArr;
        }

        private List f(int i10) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i10 > 0) {
                int iMin = Math.min(i10, 4096);
                byte[] bArr = new byte[iMin];
                int i11 = 0;
                while (i11 < iMin) {
                    int i12 = this.f41008a.read(bArr, i11, iMin - i11);
                    if (i12 == -1) {
                        throw InvalidProtocolBufferException.truncatedMessage();
                    }
                    this.f41014g += i12;
                    i11 += i12;
                }
                i10 -= iMin;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        private void g() {
            int i10 = this.f41010c + this.f41011d;
            this.f41010c = i10;
            int i11 = this.f41014g + i10;
            int i12 = this.f41015h;
            if (i11 <= i12) {
                this.f41011d = 0;
                return;
            }
            int i13 = i11 - i12;
            this.f41011d = i13;
            this.f41010c = i10 - i13;
        }

        private void h(int i10) throws InvalidProtocolBufferException {
            if (n(i10)) {
                return;
            }
            if (i10 <= (this.sizeLimit - this.f41014g) - this.f41012e) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            throw InvalidProtocolBufferException.sizeLimitExceeded();
        }

        private static long i(InputStream inputStream, long j10) throws InvalidProtocolBufferException {
            try {
                return inputStream.skip(j10);
            } catch (InvalidProtocolBufferException e10) {
                e10.setThrownFromInputStream();
                throw e10;
            }
        }

        private void j(int i10) throws InvalidProtocolBufferException {
            if (i10 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int i11 = this.f41014g;
            int i12 = this.f41012e;
            int i13 = i11 + i12 + i10;
            int i14 = this.f41015h;
            if (i13 > i14) {
                skipRawBytes((i14 - i11) - i12);
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.f41014g = i11 + i12;
            int i15 = this.f41010c - i12;
            this.f41010c = 0;
            this.f41012e = 0;
            while (i15 < i10) {
                try {
                    long j10 = i10 - i15;
                    long jI = i(this.f41008a, j10);
                    if (jI < 0 || jI > j10) {
                        throw new IllegalStateException(this.f41008a.getClass() + "#skip returned invalid result: " + jI + "\nThe InputStream implementation is buggy.");
                    }
                    if (jI == 0) {
                        break;
                    } else {
                        i15 += (int) jI;
                    }
                } catch (Throwable th) {
                    this.f41014g += i15;
                    g();
                    throw th;
                }
            }
            this.f41014g += i15;
            g();
            if (i15 >= i10) {
                return;
            }
            int i16 = this.f41010c;
            int i17 = i16 - this.f41012e;
            this.f41012e = i16;
            h(1);
            while (true) {
                int i18 = i10 - i17;
                int i19 = this.f41010c;
                if (i18 <= i19) {
                    this.f41012e = i18;
                    return;
                } else {
                    i17 += i19;
                    this.f41012e = i19;
                    h(1);
                }
            }
        }

        private void k() throws InvalidProtocolBufferException {
            if (this.f41010c - this.f41012e >= 10) {
                l();
            } else {
                m();
            }
        }

        private void l() throws InvalidProtocolBufferException {
            for (int i10 = 0; i10 < 10; i10++) {
                byte[] bArr = this.f41009b;
                int i11 = this.f41012e;
                this.f41012e = i11 + 1;
                if (bArr[i11] >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        private void m() throws InvalidProtocolBufferException {
            for (int i10 = 0; i10 < 10; i10++) {
                if (readRawByte() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        private boolean n(int i10) throws InvalidProtocolBufferException {
            int i11 = this.f41012e;
            int i12 = i11 + i10;
            int i13 = this.f41010c;
            if (i12 <= i13) {
                throw new IllegalStateException("refillBuffer() called when " + i10 + " bytes were already available in buffer");
            }
            int i14 = this.sizeLimit;
            int i15 = this.f41014g;
            if (i10 > (i14 - i15) - i11 || i15 + i11 + i10 > this.f41015h) {
                return false;
            }
            if (i11 > 0) {
                if (i13 > i11) {
                    byte[] bArr = this.f41009b;
                    System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
                }
                this.f41014g += i11;
                this.f41010c -= i11;
                this.f41012e = 0;
            }
            InputStream inputStream = this.f41008a;
            byte[] bArr2 = this.f41009b;
            int i16 = this.f41010c;
            int iB = b(inputStream, bArr2, i16, Math.min(bArr2.length - i16, (this.sizeLimit - this.f41014g) - i16));
            if (iB == 0 || iB < -1 || iB > this.f41009b.length) {
                throw new IllegalStateException(this.f41008a.getClass() + "#read(byte[]) returned invalid result: " + iB + "\nThe InputStream implementation is buggy.");
            }
            if (iB <= 0) {
                return false;
            }
            this.f41010c += iB;
            g();
            if (this.f41010c >= i10) {
                return true;
            }
            return n(i10);
        }

        @Override // com.google.protobuf.CodedInputStream
        public void checkLastTagWas(int i10) throws InvalidProtocolBufferException {
            if (this.f41013f != i10) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        @Override // com.google.protobuf.CodedInputStream
        public void enableAliasing(boolean z9) {
        }

        @Override // com.google.protobuf.CodedInputStream
        public int getBytesUntilLimit() {
            int i10 = this.f41015h;
            if (i10 == Integer.MAX_VALUE) {
                return -1;
            }
            return i10 - (this.f41014g + this.f41012e);
        }

        @Override // com.google.protobuf.CodedInputStream
        public int getLastTag() {
            return this.f41013f;
        }

        @Override // com.google.protobuf.CodedInputStream
        public int getTotalBytesRead() {
            return this.f41014g + this.f41012e;
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean isAtEnd() {
            return this.f41012e == this.f41010c && !n(1);
        }

        @Override // com.google.protobuf.CodedInputStream
        public void popLimit(int i10) {
            this.f41015h = i10;
            g();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int pushLimit(int i10) throws InvalidProtocolBufferException {
            if (i10 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int i11 = i10 + this.f41014g + this.f41012e;
            int i12 = this.f41015h;
            if (i11 > i12) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.f41015h = i11;
            g();
            return i12;
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean readBool() {
            return readRawVarint64() != 0;
        }

        @Override // com.google.protobuf.CodedInputStream
        public byte[] readByteArray() throws InvalidProtocolBufferException {
            int rawVarint32 = readRawVarint32();
            int i10 = this.f41010c;
            int i11 = this.f41012e;
            if (rawVarint32 > i10 - i11 || rawVarint32 <= 0) {
                if (rawVarint32 >= 0) {
                    return d(rawVarint32, false);
                }
                throw InvalidProtocolBufferException.negativeSize();
            }
            byte[] bArrCopyOfRange = Arrays.copyOfRange(this.f41009b, i11, i11 + rawVarint32);
            this.f41012e += rawVarint32;
            return bArrCopyOfRange;
        }

        @Override // com.google.protobuf.CodedInputStream
        public ByteBuffer readByteBuffer() throws InvalidProtocolBufferException {
            int rawVarint32 = readRawVarint32();
            int i10 = this.f41010c;
            int i11 = this.f41012e;
            if (rawVarint32 <= i10 - i11 && rawVarint32 > 0) {
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(Arrays.copyOfRange(this.f41009b, i11, i11 + rawVarint32));
                this.f41012e += rawVarint32;
                return byteBufferWrap;
            }
            if (rawVarint32 == 0) {
                return Internal.EMPTY_BYTE_BUFFER;
            }
            if (rawVarint32 >= 0) {
                return ByteBuffer.wrap(d(rawVarint32, true));
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        @Override // com.google.protobuf.CodedInputStream
        public ByteString readBytes() throws InvalidProtocolBufferException {
            int rawVarint32 = readRawVarint32();
            int i10 = this.f41010c;
            int i11 = this.f41012e;
            if (rawVarint32 <= i10 - i11 && rawVarint32 > 0) {
                ByteString byteStringCopyFrom = ByteString.copyFrom(this.f41009b, i11, rawVarint32);
                this.f41012e += rawVarint32;
                return byteStringCopyFrom;
            }
            if (rawVarint32 == 0) {
                return ByteString.EMPTY;
            }
            if (rawVarint32 >= 0) {
                return c(rawVarint32);
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        @Override // com.google.protobuf.CodedInputStream
        public double readDouble() {
            return Double.longBitsToDouble(readRawLittleEndian64());
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readEnum() {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readFixed32() {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readFixed64() {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public float readFloat() {
            return Float.intBitsToFloat(readRawLittleEndian32());
        }

        @Override // com.google.protobuf.CodedInputStream
        public void readGroup(int i10, MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            checkRecursionLimit();
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(WireFormat.makeTag(i10, 4));
            this.recursionDepth--;
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readInt32() {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readInt64() {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public void readMessage(MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() != 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            popLimit(iPushLimit);
        }

        @Override // com.google.protobuf.CodedInputStream
        public byte readRawByte() throws InvalidProtocolBufferException {
            if (this.f41012e == this.f41010c) {
                h(1);
            }
            byte[] bArr = this.f41009b;
            int i10 = this.f41012e;
            this.f41012e = i10 + 1;
            return bArr[i10];
        }

        @Override // com.google.protobuf.CodedInputStream
        public byte[] readRawBytes(int i10) {
            int i11 = this.f41012e;
            if (i10 > this.f41010c - i11 || i10 <= 0) {
                return d(i10, false);
            }
            int i12 = i10 + i11;
            this.f41012e = i12;
            return Arrays.copyOfRange(this.f41009b, i11, i12);
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readRawLittleEndian32() throws InvalidProtocolBufferException {
            int i10 = this.f41012e;
            if (this.f41010c - i10 < 4) {
                h(4);
                i10 = this.f41012e;
            }
            byte[] bArr = this.f41009b;
            this.f41012e = i10 + 4;
            return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readRawLittleEndian64() throws InvalidProtocolBufferException {
            int i10 = this.f41012e;
            if (this.f41010c - i10 < 8) {
                h(8);
                i10 = this.f41012e;
            }
            byte[] bArr = this.f41009b;
            this.f41012e = i10 + 8;
            return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readRawVarint32() {
            int i10;
            int i11 = this.f41012e;
            int i12 = this.f41010c;
            if (i12 != i11) {
                byte[] bArr = this.f41009b;
                int i13 = i11 + 1;
                byte b10 = bArr[i11];
                if (b10 >= 0) {
                    this.f41012e = i13;
                    return b10;
                }
                if (i12 - i13 >= 9) {
                    int i14 = i11 + 2;
                    int i15 = (bArr[i13] << 7) ^ b10;
                    if (i15 < 0) {
                        i10 = i15 ^ (-128);
                    } else {
                        int i16 = i11 + 3;
                        int i17 = (bArr[i14] << 14) ^ i15;
                        if (i17 >= 0) {
                            i10 = i17 ^ 16256;
                        } else {
                            int i18 = i11 + 4;
                            int i19 = i17 ^ (bArr[i16] << 21);
                            if (i19 < 0) {
                                i10 = (-2080896) ^ i19;
                            } else {
                                i16 = i11 + 5;
                                byte b11 = bArr[i18];
                                int i20 = (i19 ^ (b11 << 28)) ^ 266354560;
                                if (b11 < 0) {
                                    i18 = i11 + 6;
                                    if (bArr[i16] < 0) {
                                        i16 = i11 + 7;
                                        if (bArr[i18] < 0) {
                                            i18 = i11 + 8;
                                            if (bArr[i16] < 0) {
                                                i16 = i11 + 9;
                                                if (bArr[i18] < 0) {
                                                    int i21 = i11 + 10;
                                                    if (bArr[i16] >= 0) {
                                                        i14 = i21;
                                                        i10 = i20;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i10 = i20;
                                }
                                i10 = i20;
                            }
                            i14 = i18;
                        }
                        i14 = i16;
                    }
                    this.f41012e = i14;
                    return i10;
                }
            }
            return (int) readRawVarint64SlowPath();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readRawVarint64() {
            long j10;
            long j11;
            long j12;
            int i10 = this.f41012e;
            int i11 = this.f41010c;
            if (i11 != i10) {
                byte[] bArr = this.f41009b;
                int i12 = i10 + 1;
                byte b10 = bArr[i10];
                if (b10 >= 0) {
                    this.f41012e = i12;
                    return b10;
                }
                if (i11 - i12 >= 9) {
                    int i13 = i10 + 2;
                    int i14 = (bArr[i12] << 7) ^ b10;
                    if (i14 < 0) {
                        j10 = i14 ^ (-128);
                    } else {
                        int i15 = i10 + 3;
                        int i16 = (bArr[i13] << 14) ^ i14;
                        if (i16 >= 0) {
                            j10 = i16 ^ 16256;
                            i13 = i15;
                        } else {
                            int i17 = i10 + 4;
                            int i18 = i16 ^ (bArr[i15] << 21);
                            if (i18 < 0) {
                                long j13 = (-2080896) ^ i18;
                                i13 = i17;
                                j10 = j13;
                            } else {
                                long j14 = i18;
                                i13 = i10 + 5;
                                long j15 = j14 ^ (((long) bArr[i17]) << 28);
                                if (j15 >= 0) {
                                    j12 = 266354560;
                                } else {
                                    int i19 = i10 + 6;
                                    long j16 = j15 ^ (((long) bArr[i13]) << 35);
                                    if (j16 < 0) {
                                        j11 = -34093383808L;
                                    } else {
                                        i13 = i10 + 7;
                                        j15 = j16 ^ (((long) bArr[i19]) << 42);
                                        if (j15 >= 0) {
                                            j12 = 4363953127296L;
                                        } else {
                                            i19 = i10 + 8;
                                            j16 = j15 ^ (((long) bArr[i13]) << 49);
                                            if (j16 < 0) {
                                                j11 = -558586000294016L;
                                            } else {
                                                i13 = i10 + 9;
                                                long j17 = (j16 ^ (((long) bArr[i19]) << 56)) ^ 71499008037633920L;
                                                if (j17 < 0) {
                                                    int i20 = i10 + 10;
                                                    if (bArr[i13] >= 0) {
                                                        i13 = i20;
                                                    }
                                                }
                                                j10 = j17;
                                            }
                                        }
                                    }
                                    j10 = j16 ^ j11;
                                    i13 = i19;
                                }
                                j10 = j15 ^ j12;
                            }
                        }
                    }
                    this.f41012e = i13;
                    return j10;
                }
            }
            return readRawVarint64SlowPath();
        }

        @Override // com.google.protobuf.CodedInputStream
        long readRawVarint64SlowPath() throws InvalidProtocolBufferException {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte rawByte = readRawByte();
                j10 |= ((long) (rawByte & 127)) << i10;
                if ((rawByte & 128) == 0) {
                    return j10;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readSFixed32() {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readSFixed64() {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readSInt32() {
            return CodedInputStream.decodeZigZag32(readRawVarint32());
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readSInt64() {
            return CodedInputStream.decodeZigZag64(readRawVarint64());
        }

        @Override // com.google.protobuf.CodedInputStream
        public String readString() throws InvalidProtocolBufferException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                int i10 = this.f41010c;
                int i11 = this.f41012e;
                if (rawVarint32 <= i10 - i11) {
                    String str = new String(this.f41009b, i11, rawVarint32, Internal.UTF_8);
                    this.f41012e += rawVarint32;
                    return str;
                }
            }
            if (rawVarint32 == 0) {
                return "";
            }
            if (rawVarint32 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            if (rawVarint32 > this.f41010c) {
                return new String(d(rawVarint32, false), Internal.UTF_8);
            }
            h(rawVarint32);
            String str2 = new String(this.f41009b, this.f41012e, rawVarint32, Internal.UTF_8);
            this.f41012e += rawVarint32;
            return str2;
        }

        @Override // com.google.protobuf.CodedInputStream
        public String readStringRequireUtf8() throws IOException {
            byte[] bArrD;
            int rawVarint32 = readRawVarint32();
            int i10 = this.f41012e;
            int i11 = this.f41010c;
            if (rawVarint32 <= i11 - i10 && rawVarint32 > 0) {
                bArrD = this.f41009b;
                this.f41012e = i10 + rawVarint32;
            } else {
                if (rawVarint32 == 0) {
                    return "";
                }
                if (rawVarint32 < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                i10 = 0;
                if (rawVarint32 <= i11) {
                    h(rawVarint32);
                    bArrD = this.f41009b;
                    this.f41012e = rawVarint32;
                } else {
                    bArrD = d(rawVarint32, false);
                }
            }
            return W.h(bArrD, i10, rawVarint32);
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readTag() throws InvalidProtocolBufferException {
            if (isAtEnd()) {
                this.f41013f = 0;
                return 0;
            }
            int rawVarint32 = readRawVarint32();
            this.f41013f = rawVarint32;
            if (WireFormat.getTagFieldNumber(rawVarint32) != 0) {
                return this.f41013f;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readUInt32() {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readUInt64() {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public void readUnknownGroup(int i10, MessageLite.Builder builder) throws InvalidProtocolBufferException {
            readGroup(i10, builder, ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // com.google.protobuf.CodedInputStream
        public void resetSizeCounter() {
            this.f41014g = -this.f41012e;
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean skipField(int i10) throws InvalidProtocolBufferException {
            int tagWireType = WireFormat.getTagWireType(i10);
            if (tagWireType == 0) {
                k();
                return true;
            }
            if (tagWireType == 1) {
                skipRawBytes(8);
                return true;
            }
            if (tagWireType == 2) {
                skipRawBytes(readRawVarint32());
                return true;
            }
            if (tagWireType == 3) {
                skipMessage();
                checkLastTagWas(WireFormat.makeTag(WireFormat.getTagFieldNumber(i10), 4));
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            skipRawBytes(4);
            return true;
        }

        @Override // com.google.protobuf.CodedInputStream
        public void skipRawBytes(int i10) throws InvalidProtocolBufferException {
            int i11 = this.f41010c;
            int i12 = this.f41012e;
            if (i10 > i11 - i12 || i10 < 0) {
                j(i10);
            } else {
                this.f41012e = i12 + i10;
            }
        }

        private d(InputStream inputStream, int i10) {
            super();
            this.f41015h = Integer.MAX_VALUE;
            Internal.checkNotNull(inputStream, "input");
            this.f41008a = inputStream;
            this.f41009b = new byte[i10];
            this.f41010c = 0;
            this.f41012e = 0;
            this.f41014g = 0;
        }

        @Override // com.google.protobuf.CodedInputStream
        public MessageLite readGroup(int i10, Parser parser, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            checkRecursionLimit();
            this.recursionDepth++;
            MessageLite messageLite = (MessageLite) parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(WireFormat.makeTag(i10, 4));
            this.recursionDepth--;
            return messageLite;
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean skipField(int i10, CodedOutputStream codedOutputStream) throws InvalidProtocolBufferException {
            int tagWireType = WireFormat.getTagWireType(i10);
            if (tagWireType == 0) {
                long int64 = readInt64();
                codedOutputStream.writeUInt32NoTag(i10);
                codedOutputStream.writeUInt64NoTag(int64);
                return true;
            }
            if (tagWireType == 1) {
                long rawLittleEndian64 = readRawLittleEndian64();
                codedOutputStream.writeUInt32NoTag(i10);
                codedOutputStream.writeFixed64NoTag(rawLittleEndian64);
                return true;
            }
            if (tagWireType == 2) {
                ByteString bytes = readBytes();
                codedOutputStream.writeUInt32NoTag(i10);
                codedOutputStream.writeBytesNoTag(bytes);
                return true;
            }
            if (tagWireType == 3) {
                codedOutputStream.writeUInt32NoTag(i10);
                skipMessage(codedOutputStream);
                int iMakeTag = WireFormat.makeTag(WireFormat.getTagFieldNumber(i10), 4);
                checkLastTagWas(iMakeTag);
                codedOutputStream.writeUInt32NoTag(iMakeTag);
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType == 5) {
                int rawLittleEndian32 = readRawLittleEndian32();
                codedOutputStream.writeUInt32NoTag(i10);
                codedOutputStream.writeFixed32NoTag(rawLittleEndian32);
                return true;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }

        @Override // com.google.protobuf.CodedInputStream
        public MessageLite readMessage(Parser parser, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.recursionDepth++;
            MessageLite messageLite = (MessageLite) parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() == 0) {
                popLimit(iPushLimit);
                return messageLite;
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    private static final class e extends CodedInputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ByteBuffer f41016a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f41017b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f41018c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f41019d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f41020e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f41021f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f41022g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f41023h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f41024i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f41025j;

        private int a(long j10) {
            return (int) (j10 - this.f41018c);
        }

        static boolean b() {
            return V.K();
        }

        private void c() {
            long j10 = this.f41019d + ((long) this.f41022g);
            this.f41019d = j10;
            int i10 = (int) (j10 - this.f41021f);
            int i11 = this.f41025j;
            if (i10 <= i11) {
                this.f41022g = 0;
                return;
            }
            int i12 = i10 - i11;
            this.f41022g = i12;
            this.f41019d = j10 - ((long) i12);
        }

        private int d() {
            return (int) (this.f41019d - this.f41020e);
        }

        private void e() throws InvalidProtocolBufferException {
            if (d() >= 10) {
                f();
            } else {
                g();
            }
        }

        private void f() throws InvalidProtocolBufferException {
            for (int i10 = 0; i10 < 10; i10++) {
                long j10 = this.f41020e;
                this.f41020e = 1 + j10;
                if (V.x(j10) >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        private void g() throws InvalidProtocolBufferException {
            for (int i10 = 0; i10 < 10; i10++) {
                if (readRawByte() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        private ByteBuffer h(long j10, long j11) {
            int iPosition = this.f41016a.position();
            int iLimit = this.f41016a.limit();
            ByteBuffer byteBuffer = this.f41016a;
            try {
                try {
                    byteBuffer.position(a(j10));
                    byteBuffer.limit(a(j11));
                    ByteBuffer byteBufferSlice = this.f41016a.slice();
                    byteBuffer.position(iPosition);
                    byteBuffer.limit(iLimit);
                    return byteBufferSlice;
                } catch (IllegalArgumentException e10) {
                    InvalidProtocolBufferException invalidProtocolBufferExceptionTruncatedMessage = InvalidProtocolBufferException.truncatedMessage();
                    invalidProtocolBufferExceptionTruncatedMessage.initCause(e10);
                    throw invalidProtocolBufferExceptionTruncatedMessage;
                }
            } catch (Throwable th) {
                byteBuffer.position(iPosition);
                byteBuffer.limit(iLimit);
                throw th;
            }
        }

        @Override // com.google.protobuf.CodedInputStream
        public void checkLastTagWas(int i10) throws InvalidProtocolBufferException {
            if (this.f41023h != i10) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        @Override // com.google.protobuf.CodedInputStream
        public void enableAliasing(boolean z9) {
            this.f41024i = z9;
        }

        @Override // com.google.protobuf.CodedInputStream
        public int getBytesUntilLimit() {
            int i10 = this.f41025j;
            if (i10 == Integer.MAX_VALUE) {
                return -1;
            }
            return i10 - getTotalBytesRead();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int getLastTag() {
            return this.f41023h;
        }

        @Override // com.google.protobuf.CodedInputStream
        public int getTotalBytesRead() {
            return (int) (this.f41020e - this.f41021f);
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean isAtEnd() {
            return this.f41020e == this.f41019d;
        }

        @Override // com.google.protobuf.CodedInputStream
        public void popLimit(int i10) {
            this.f41025j = i10;
            c();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int pushLimit(int i10) throws InvalidProtocolBufferException {
            if (i10 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int totalBytesRead = i10 + getTotalBytesRead();
            int i11 = this.f41025j;
            if (totalBytesRead > i11) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.f41025j = totalBytesRead;
            c();
            return i11;
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean readBool() {
            return readRawVarint64() != 0;
        }

        @Override // com.google.protobuf.CodedInputStream
        public byte[] readByteArray() {
            return readRawBytes(readRawVarint32());
        }

        @Override // com.google.protobuf.CodedInputStream
        public ByteBuffer readByteBuffer() throws InvalidProtocolBufferException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 <= 0 || rawVarint32 > d()) {
                if (rawVarint32 == 0) {
                    return Internal.EMPTY_BYTE_BUFFER;
                }
                if (rawVarint32 < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (this.f41017b || !this.f41024i) {
                byte[] bArr = new byte[rawVarint32];
                long j10 = rawVarint32;
                V.p(this.f41020e, bArr, 0L, j10);
                this.f41020e += j10;
                return ByteBuffer.wrap(bArr);
            }
            long j11 = this.f41020e;
            long j12 = rawVarint32;
            ByteBuffer byteBufferH = h(j11, j11 + j12);
            this.f41020e += j12;
            return byteBufferH;
        }

        @Override // com.google.protobuf.CodedInputStream
        public ByteString readBytes() throws InvalidProtocolBufferException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 <= 0 || rawVarint32 > d()) {
                if (rawVarint32 == 0) {
                    return ByteString.EMPTY;
                }
                if (rawVarint32 < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (this.f41017b && this.f41024i) {
                long j10 = this.f41020e;
                long j11 = rawVarint32;
                ByteBuffer byteBufferH = h(j10, j10 + j11);
                this.f41020e += j11;
                return ByteString.wrap(byteBufferH);
            }
            byte[] bArr = new byte[rawVarint32];
            long j12 = rawVarint32;
            V.p(this.f41020e, bArr, 0L, j12);
            this.f41020e += j12;
            return ByteString.wrap(bArr);
        }

        @Override // com.google.protobuf.CodedInputStream
        public double readDouble() {
            return Double.longBitsToDouble(readRawLittleEndian64());
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readEnum() {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readFixed32() {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readFixed64() {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public float readFloat() {
            return Float.intBitsToFloat(readRawLittleEndian32());
        }

        @Override // com.google.protobuf.CodedInputStream
        public void readGroup(int i10, MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            checkRecursionLimit();
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(WireFormat.makeTag(i10, 4));
            this.recursionDepth--;
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readInt32() {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readInt64() {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public void readMessage(MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() != 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            popLimit(iPushLimit);
        }

        @Override // com.google.protobuf.CodedInputStream
        public byte readRawByte() throws InvalidProtocolBufferException {
            long j10 = this.f41020e;
            if (j10 == this.f41019d) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.f41020e = 1 + j10;
            return V.x(j10);
        }

        @Override // com.google.protobuf.CodedInputStream
        public byte[] readRawBytes(int i10) throws InvalidProtocolBufferException {
            if (i10 < 0 || i10 > d()) {
                if (i10 > 0) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                if (i10 == 0) {
                    return Internal.EMPTY_BYTE_ARRAY;
                }
                throw InvalidProtocolBufferException.negativeSize();
            }
            byte[] bArr = new byte[i10];
            long j10 = this.f41020e;
            long j11 = i10;
            h(j10, j10 + j11).get(bArr);
            this.f41020e += j11;
            return bArr;
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readRawLittleEndian32() throws InvalidProtocolBufferException {
            long j10 = this.f41020e;
            if (this.f41019d - j10 < 4) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.f41020e = 4 + j10;
            return ((V.x(j10 + 3) & 255) << 24) | (V.x(j10) & 255) | ((V.x(1 + j10) & 255) << 8) | ((V.x(2 + j10) & 255) << 16);
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readRawLittleEndian64() throws InvalidProtocolBufferException {
            long j10 = this.f41020e;
            if (this.f41019d - j10 < 8) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.f41020e = 8 + j10;
            return ((((long) V.x(j10 + 7)) & 255) << 56) | (((long) V.x(j10)) & 255) | ((((long) V.x(1 + j10)) & 255) << 8) | ((((long) V.x(2 + j10)) & 255) << 16) | ((((long) V.x(3 + j10)) & 255) << 24) | ((((long) V.x(4 + j10)) & 255) << 32) | ((((long) V.x(5 + j10)) & 255) << 40) | ((((long) V.x(6 + j10)) & 255) << 48);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x008c, code lost:
        
            if (com.google.protobuf.V.x(r3) < 0) goto L34;
         */
        @Override // com.google.protobuf.CodedInputStream
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int readRawVarint32() {
            /*
                r9 = this;
                long r0 = r9.f41020e
                long r2 = r9.f41019d
                int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r2 != 0) goto La
                goto L8e
            La:
                r2 = 1
                long r2 = r2 + r0
                byte r4 = com.google.protobuf.V.x(r0)
                if (r4 < 0) goto L16
                r9.f41020e = r2
                return r4
            L16:
                long r5 = r9.f41019d
                long r5 = r5 - r2
                r7 = 9
                int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r5 >= 0) goto L21
                goto L8e
            L21:
                r5 = 2
                long r5 = r5 + r0
                byte r2 = com.google.protobuf.V.x(r2)
                int r2 = r2 << 7
                r2 = r2 ^ r4
                if (r2 >= 0) goto L31
                r0 = r2 ^ (-128(0xffffffffffffff80, float:NaN))
                goto L98
            L31:
                r3 = 3
                long r3 = r3 + r0
                byte r5 = com.google.protobuf.V.x(r5)
                int r5 = r5 << 14
                r2 = r2 ^ r5
                if (r2 < 0) goto L41
                r0 = r2 ^ 16256(0x3f80, float:2.278E-41)
            L3f:
                r5 = r3
                goto L98
            L41:
                r5 = 4
                long r5 = r5 + r0
                byte r3 = com.google.protobuf.V.x(r3)
                int r3 = r3 << 21
                r2 = r2 ^ r3
                if (r2 >= 0) goto L52
                r0 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L98
            L52:
                r3 = 5
                long r3 = r3 + r0
                byte r5 = com.google.protobuf.V.x(r5)
                int r6 = r5 << 28
                r2 = r2 ^ r6
                r6 = 266354560(0xfe03f80, float:2.2112565E-29)
                r2 = r2 ^ r6
                if (r5 >= 0) goto L96
                r5 = 6
                long r5 = r5 + r0
                byte r3 = com.google.protobuf.V.x(r3)
                if (r3 >= 0) goto L94
                r3 = 7
                long r3 = r3 + r0
                byte r5 = com.google.protobuf.V.x(r5)
                if (r5 >= 0) goto L96
                r5 = 8
                long r5 = r5 + r0
                byte r3 = com.google.protobuf.V.x(r3)
                if (r3 >= 0) goto L94
                long r3 = r0 + r7
                byte r5 = com.google.protobuf.V.x(r5)
                if (r5 >= 0) goto L96
                r5 = 10
                long r5 = r5 + r0
                byte r0 = com.google.protobuf.V.x(r3)
                if (r0 >= 0) goto L94
            L8e:
                long r0 = r9.readRawVarint64SlowPath()
                int r0 = (int) r0
                return r0
            L94:
                r0 = r2
                goto L98
            L96:
                r0 = r2
                goto L3f
            L98:
                r9.f41020e = r5
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.CodedInputStream.e.readRawVarint32():int");
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readRawVarint64() {
            long j10;
            long j11;
            long j12;
            int i10;
            long j13 = this.f41020e;
            if (this.f41019d != j13) {
                long j14 = 1 + j13;
                byte bX = V.x(j13);
                if (bX >= 0) {
                    this.f41020e = j14;
                    return bX;
                }
                if (this.f41019d - j14 >= 9) {
                    long j15 = 2 + j13;
                    int iX = (V.x(j14) << 7) ^ bX;
                    if (iX >= 0) {
                        long j16 = 3 + j13;
                        int iX2 = iX ^ (V.x(j15) << 14);
                        if (iX2 >= 0) {
                            j10 = iX2 ^ 16256;
                            j15 = j16;
                        } else {
                            j15 = 4 + j13;
                            int iX3 = iX2 ^ (V.x(j16) << 21);
                            if (iX3 < 0) {
                                i10 = (-2080896) ^ iX3;
                            } else {
                                long j17 = 5 + j13;
                                long jX = ((long) iX3) ^ (((long) V.x(j15)) << 28);
                                if (jX >= 0) {
                                    j12 = 266354560;
                                } else {
                                    long j18 = 6 + j13;
                                    long jX2 = jX ^ (((long) V.x(j17)) << 35);
                                    if (jX2 < 0) {
                                        j11 = -34093383808L;
                                    } else {
                                        j17 = 7 + j13;
                                        jX = jX2 ^ (((long) V.x(j18)) << 42);
                                        if (jX >= 0) {
                                            j12 = 4363953127296L;
                                        } else {
                                            j18 = 8 + j13;
                                            jX2 = jX ^ (((long) V.x(j17)) << 49);
                                            if (jX2 < 0) {
                                                j11 = -558586000294016L;
                                            } else {
                                                long j19 = j13 + 9;
                                                long jX3 = (jX2 ^ (((long) V.x(j18)) << 56)) ^ 71499008037633920L;
                                                if (jX3 < 0) {
                                                    long j20 = j13 + 10;
                                                    if (V.x(j19) >= 0) {
                                                        j15 = j20;
                                                        j10 = jX3;
                                                    }
                                                } else {
                                                    j10 = jX3;
                                                    j15 = j19;
                                                }
                                            }
                                        }
                                    }
                                    j10 = j11 ^ jX2;
                                    j15 = j18;
                                }
                                j10 = j12 ^ jX;
                                j15 = j17;
                            }
                        }
                        this.f41020e = j15;
                        return j10;
                    }
                    i10 = iX ^ (-128);
                    j10 = i10;
                    this.f41020e = j15;
                    return j10;
                }
            }
            return readRawVarint64SlowPath();
        }

        @Override // com.google.protobuf.CodedInputStream
        long readRawVarint64SlowPath() throws InvalidProtocolBufferException {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte rawByte = readRawByte();
                j10 |= ((long) (rawByte & 127)) << i10;
                if ((rawByte & 128) == 0) {
                    return j10;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readSFixed32() {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readSFixed64() {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readSInt32() {
            return CodedInputStream.decodeZigZag32(readRawVarint32());
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readSInt64() {
            return CodedInputStream.decodeZigZag64(readRawVarint64());
        }

        @Override // com.google.protobuf.CodedInputStream
        public String readString() throws InvalidProtocolBufferException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 <= 0 || rawVarint32 > d()) {
                if (rawVarint32 == 0) {
                    return "";
                }
                if (rawVarint32 < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = new byte[rawVarint32];
            long j10 = rawVarint32;
            V.p(this.f41020e, bArr, 0L, j10);
            String str = new String(bArr, Internal.UTF_8);
            this.f41020e += j10;
            return str;
        }

        @Override // com.google.protobuf.CodedInputStream
        public String readStringRequireUtf8() throws InvalidProtocolBufferException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0 && rawVarint32 <= d()) {
                String strG = W.g(this.f41016a, a(this.f41020e), rawVarint32);
                this.f41020e += (long) rawVarint32;
                return strG;
            }
            if (rawVarint32 == 0) {
                return "";
            }
            if (rawVarint32 <= 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readTag() throws InvalidProtocolBufferException {
            if (isAtEnd()) {
                this.f41023h = 0;
                return 0;
            }
            int rawVarint32 = readRawVarint32();
            this.f41023h = rawVarint32;
            if (WireFormat.getTagFieldNumber(rawVarint32) != 0) {
                return this.f41023h;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        @Override // com.google.protobuf.CodedInputStream
        public int readUInt32() {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public long readUInt64() {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public void readUnknownGroup(int i10, MessageLite.Builder builder) throws InvalidProtocolBufferException {
            readGroup(i10, builder, ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // com.google.protobuf.CodedInputStream
        public void resetSizeCounter() {
            this.f41021f = this.f41020e;
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean skipField(int i10) throws InvalidProtocolBufferException {
            int tagWireType = WireFormat.getTagWireType(i10);
            if (tagWireType == 0) {
                e();
                return true;
            }
            if (tagWireType == 1) {
                skipRawBytes(8);
                return true;
            }
            if (tagWireType == 2) {
                skipRawBytes(readRawVarint32());
                return true;
            }
            if (tagWireType == 3) {
                skipMessage();
                checkLastTagWas(WireFormat.makeTag(WireFormat.getTagFieldNumber(i10), 4));
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            skipRawBytes(4);
            return true;
        }

        @Override // com.google.protobuf.CodedInputStream
        public void skipRawBytes(int i10) throws InvalidProtocolBufferException {
            if (i10 >= 0 && i10 <= d()) {
                this.f41020e += (long) i10;
            } else {
                if (i10 >= 0) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                throw InvalidProtocolBufferException.negativeSize();
            }
        }

        private e(ByteBuffer byteBuffer, boolean z9) {
            super();
            this.f41025j = Integer.MAX_VALUE;
            this.f41016a = byteBuffer;
            long jK = V.k(byteBuffer);
            this.f41018c = jK;
            this.f41019d = ((long) byteBuffer.limit()) + jK;
            long jPosition = jK + ((long) byteBuffer.position());
            this.f41020e = jPosition;
            this.f41021f = jPosition;
            this.f41017b = z9;
        }

        @Override // com.google.protobuf.CodedInputStream
        public MessageLite readGroup(int i10, Parser parser, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            checkRecursionLimit();
            this.recursionDepth++;
            MessageLite messageLite = (MessageLite) parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(WireFormat.makeTag(i10, 4));
            this.recursionDepth--;
            return messageLite;
        }

        @Override // com.google.protobuf.CodedInputStream
        public boolean skipField(int i10, CodedOutputStream codedOutputStream) throws InvalidProtocolBufferException {
            int tagWireType = WireFormat.getTagWireType(i10);
            if (tagWireType == 0) {
                long int64 = readInt64();
                codedOutputStream.writeUInt32NoTag(i10);
                codedOutputStream.writeUInt64NoTag(int64);
                return true;
            }
            if (tagWireType == 1) {
                long rawLittleEndian64 = readRawLittleEndian64();
                codedOutputStream.writeUInt32NoTag(i10);
                codedOutputStream.writeFixed64NoTag(rawLittleEndian64);
                return true;
            }
            if (tagWireType == 2) {
                ByteString bytes = readBytes();
                codedOutputStream.writeUInt32NoTag(i10);
                codedOutputStream.writeBytesNoTag(bytes);
                return true;
            }
            if (tagWireType == 3) {
                codedOutputStream.writeUInt32NoTag(i10);
                skipMessage(codedOutputStream);
                int iMakeTag = WireFormat.makeTag(WireFormat.getTagFieldNumber(i10), 4);
                checkLastTagWas(iMakeTag);
                codedOutputStream.writeUInt32NoTag(iMakeTag);
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType == 5) {
                int rawLittleEndian32 = readRawLittleEndian32();
                codedOutputStream.writeUInt32NoTag(i10);
                codedOutputStream.writeFixed32NoTag(rawLittleEndian32);
                return true;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }

        @Override // com.google.protobuf.CodedInputStream
        public MessageLite readMessage(Parser parser, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.recursionDepth++;
            MessageLite messageLite = (MessageLite) parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() == 0) {
                popLimit(iPushLimit);
                return messageLite;
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    public static int decodeZigZag32(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public static long decodeZigZag64(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    public static CodedInputStream newInstance(InputStream inputStream) {
        return newInstance(inputStream, 4096);
    }

    public static int readRawVarint32(int i10, InputStream inputStream) throws IOException {
        if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 0) {
            return i10;
        }
        int i11 = i10 & 127;
        int i12 = 7;
        while (i12 < 32) {
            int i13 = inputStream.read();
            if (i13 == -1) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            i11 |= (i13 & 127) << i12;
            if ((i13 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 0) {
                return i11;
            }
            i12 += 7;
        }
        while (i12 < 64) {
            int i14 = inputStream.read();
            if (i14 == -1) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if ((i14 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 0) {
                return i11;
            }
            i12 += 7;
        }
        throw InvalidProtocolBufferException.malformedVarint();
    }

    public abstract void checkLastTagWas(int i10);

    public void checkRecursionLimit() throws InvalidProtocolBufferException {
        if (this.recursionDepth >= this.recursionLimit) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
    }

    final void discardUnknownFields() {
        this.shouldDiscardUnknownFields = true;
    }

    public abstract void enableAliasing(boolean z9);

    public abstract int getBytesUntilLimit();

    public abstract int getLastTag();

    public abstract int getTotalBytesRead();

    public abstract boolean isAtEnd();

    public abstract void popLimit(int i10);

    public abstract int pushLimit(int i10);

    public abstract boolean readBool();

    public abstract byte[] readByteArray();

    public abstract ByteBuffer readByteBuffer();

    public abstract ByteString readBytes();

    public abstract double readDouble();

    public abstract int readEnum();

    public abstract int readFixed32();

    public abstract long readFixed64();

    public abstract float readFloat();

    public abstract <T extends MessageLite> T readGroup(int i10, Parser<T> parser, ExtensionRegistryLite extensionRegistryLite);

    public abstract void readGroup(int i10, MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite);

    public abstract int readInt32();

    public abstract long readInt64();

    public abstract <T extends MessageLite> T readMessage(Parser<T> parser, ExtensionRegistryLite extensionRegistryLite);

    public abstract void readMessage(MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite);

    public abstract byte readRawByte();

    public abstract byte[] readRawBytes(int i10);

    public abstract int readRawLittleEndian32();

    public abstract long readRawLittleEndian64();

    public abstract int readRawVarint32();

    public abstract long readRawVarint64();

    abstract long readRawVarint64SlowPath();

    public abstract int readSFixed32();

    public abstract long readSFixed64();

    public abstract int readSInt32();

    public abstract long readSInt64();

    public abstract String readString();

    public abstract String readStringRequireUtf8();

    public abstract int readTag();

    public abstract int readUInt32();

    public abstract long readUInt64();

    @Deprecated
    public abstract void readUnknownGroup(int i10, MessageLite.Builder builder);

    public abstract void resetSizeCounter();

    public final int setRecursionLimit(int i10) {
        if (i10 >= 0) {
            int i11 = this.recursionLimit;
            this.recursionLimit = i10;
            return i11;
        }
        throw new IllegalArgumentException("Recursion limit cannot be negative: " + i10);
    }

    public final int setSizeLimit(int i10) {
        if (i10 >= 0) {
            int i11 = this.sizeLimit;
            this.sizeLimit = i10;
            return i11;
        }
        throw new IllegalArgumentException("Size limit cannot be negative: " + i10);
    }

    final boolean shouldDiscardUnknownFields() {
        return this.shouldDiscardUnknownFields;
    }

    public abstract boolean skipField(int i10);

    @Deprecated
    public abstract boolean skipField(int i10, CodedOutputStream codedOutputStream);

    public void skipMessage() throws InvalidProtocolBufferException {
        boolean zSkipField;
        do {
            int tag = readTag();
            if (tag == 0) {
                return;
            }
            checkRecursionLimit();
            this.recursionDepth++;
            zSkipField = skipField(tag);
            this.recursionDepth--;
        } while (zSkipField);
    }

    public abstract void skipRawBytes(int i10);

    final void unsetDiscardUnknownFields() {
        this.shouldDiscardUnknownFields = false;
    }

    private CodedInputStream() {
        this.recursionLimit = defaultRecursionLimit;
        this.sizeLimit = Integer.MAX_VALUE;
        this.shouldDiscardUnknownFields = false;
    }

    public static CodedInputStream newInstance(InputStream inputStream, int i10) {
        if (i10 > 0) {
            return inputStream == null ? newInstance(Internal.EMPTY_BYTE_ARRAY) : new d(inputStream, i10);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    public static CodedInputStream newInstance(Iterable<ByteBuffer> iterable) {
        if (!e.b()) {
            return newInstance(new C6758p(iterable));
        }
        return newInstance(iterable, false);
    }

    static int readRawVarint32(InputStream inputStream) throws IOException {
        int i10 = inputStream.read();
        if (i10 != -1) {
            return readRawVarint32(i10, inputStream);
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public void skipMessage(CodedOutputStream codedOutputStream) throws InvalidProtocolBufferException {
        boolean zSkipField;
        do {
            int tag = readTag();
            if (tag == 0) {
                return;
            }
            checkRecursionLimit();
            this.recursionDepth++;
            zSkipField = skipField(tag, codedOutputStream);
            this.recursionDepth--;
        } while (zSkipField);
    }

    static CodedInputStream newInstance(Iterable<ByteBuffer> iterable, boolean z9) {
        int i10 = 0;
        int iRemaining = 0;
        for (ByteBuffer byteBuffer : iterable) {
            iRemaining += byteBuffer.remaining();
            if (byteBuffer.hasArray()) {
                i10 |= 1;
            } else {
                i10 = byteBuffer.isDirect() ? i10 | 2 : i10 | 4;
            }
        }
        if (i10 == 2) {
            return new c(iterable, iRemaining, z9);
        }
        return newInstance(new C6758p(iterable));
    }

    public static CodedInputStream newInstance(byte[] bArr) {
        return newInstance(bArr, 0, bArr.length);
    }

    public static CodedInputStream newInstance(byte[] bArr, int i10, int i11) {
        return newInstance(bArr, i10, i11, false);
    }

    static CodedInputStream newInstance(byte[] bArr, int i10, int i11, boolean z9) {
        b bVar = new b(bArr, i10, i11, z9);
        try {
            bVar.pushLimit(i11);
            return bVar;
        } catch (InvalidProtocolBufferException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static CodedInputStream newInstance(ByteBuffer byteBuffer) {
        return newInstance(byteBuffer, false);
    }

    static CodedInputStream newInstance(ByteBuffer byteBuffer, boolean z9) {
        if (byteBuffer.hasArray()) {
            return newInstance(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining(), z9);
        }
        if (byteBuffer.isDirect() && e.b()) {
            return new e(byteBuffer, z9);
        }
        int iRemaining = byteBuffer.remaining();
        byte[] bArr = new byte[iRemaining];
        byteBuffer.duplicate().get(bArr);
        return newInstance(bArr, 0, iRemaining, true);
    }
}
