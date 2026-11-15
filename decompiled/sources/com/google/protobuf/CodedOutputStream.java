package com.google.protobuf;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class CodedOutputStream extends ByteOutput {
    public static final int DEFAULT_BUFFER_SIZE = 4096;

    @Deprecated
    public static final int LITTLE_ENDIAN_32_SIZE = 4;
    private boolean serializationDeterministic;
    C6749g wrapper;
    private static final Logger logger = Logger.getLogger(CodedOutputStream.class.getName());
    private static final boolean HAS_UNSAFE_ARRAY_OPERATIONS = V.J();

    public static class OutOfSpaceException extends IOException {
        private static final String MESSAGE = "CodedOutputStream was writing to a flat byte array and ran out of space.";
        private static final long serialVersionUID = -6947486886997889499L;

        OutOfSpaceException() {
            super(MESSAGE);
        }

        OutOfSpaceException(String str) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str);
        }

        OutOfSpaceException(Throwable th) {
            super(MESSAGE, th);
        }

        OutOfSpaceException(String str, Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th);
        }
    }

    private static abstract class b extends CodedOutputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final byte[] f41026a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f41027b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f41028c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f41029d;

        b(int i10) {
            super();
            if (i10 < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            byte[] bArr = new byte[Math.max(i10, 20)];
            this.f41026a = bArr;
            this.f41027b = bArr.length;
        }

        final void a(byte b10) {
            byte[] bArr = this.f41026a;
            int i10 = this.f41028c;
            this.f41028c = i10 + 1;
            bArr[i10] = b10;
            this.f41029d++;
        }

        final void b(int i10) {
            byte[] bArr = this.f41026a;
            int i11 = this.f41028c;
            int i12 = i11 + 1;
            this.f41028c = i12;
            bArr[i11] = (byte) (i10 & 255);
            int i13 = i11 + 2;
            this.f41028c = i13;
            bArr[i12] = (byte) ((i10 >> 8) & 255);
            int i14 = i11 + 3;
            this.f41028c = i14;
            bArr[i13] = (byte) ((i10 >> 16) & 255);
            this.f41028c = i11 + 4;
            bArr[i14] = (byte) ((i10 >> 24) & 255);
            this.f41029d += 4;
        }

        final void c(long j10) {
            byte[] bArr = this.f41026a;
            int i10 = this.f41028c;
            int i11 = i10 + 1;
            this.f41028c = i11;
            bArr[i10] = (byte) (j10 & 255);
            int i12 = i10 + 2;
            this.f41028c = i12;
            bArr[i11] = (byte) ((j10 >> 8) & 255);
            int i13 = i10 + 3;
            this.f41028c = i13;
            bArr[i12] = (byte) ((j10 >> 16) & 255);
            int i14 = i10 + 4;
            this.f41028c = i14;
            bArr[i13] = (byte) (255 & (j10 >> 24));
            int i15 = i10 + 5;
            this.f41028c = i15;
            bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
            int i16 = i10 + 6;
            this.f41028c = i16;
            bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
            int i17 = i10 + 7;
            this.f41028c = i17;
            bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
            this.f41028c = i10 + 8;
            bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
            this.f41029d += 8;
        }

        final void d(int i10) {
            if (i10 >= 0) {
                f(i10);
            } else {
                g(i10);
            }
        }

        final void e(int i10, int i11) {
            f(WireFormat.makeTag(i10, i11));
        }

        final void f(int i10) {
            if (!CodedOutputStream.HAS_UNSAFE_ARRAY_OPERATIONS) {
                while ((i10 & (-128)) != 0) {
                    byte[] bArr = this.f41026a;
                    int i11 = this.f41028c;
                    this.f41028c = i11 + 1;
                    bArr[i11] = (byte) ((i10 & 127) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                    this.f41029d++;
                    i10 >>>= 7;
                }
                byte[] bArr2 = this.f41026a;
                int i12 = this.f41028c;
                this.f41028c = i12 + 1;
                bArr2[i12] = (byte) i10;
                this.f41029d++;
                return;
            }
            long j10 = this.f41028c;
            while ((i10 & (-128)) != 0) {
                byte[] bArr3 = this.f41026a;
                int i13 = this.f41028c;
                this.f41028c = i13 + 1;
                V.R(bArr3, i13, (byte) ((i10 & 127) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT));
                i10 >>>= 7;
            }
            byte[] bArr4 = this.f41026a;
            int i14 = this.f41028c;
            this.f41028c = i14 + 1;
            V.R(bArr4, i14, (byte) i10);
            this.f41029d += (int) (((long) this.f41028c) - j10);
        }

        final void g(long j10) {
            if (!CodedOutputStream.HAS_UNSAFE_ARRAY_OPERATIONS) {
                while ((j10 & (-128)) != 0) {
                    byte[] bArr = this.f41026a;
                    int i10 = this.f41028c;
                    this.f41028c = i10 + 1;
                    bArr[i10] = (byte) ((((int) j10) & 127) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                    this.f41029d++;
                    j10 >>>= 7;
                }
                byte[] bArr2 = this.f41026a;
                int i11 = this.f41028c;
                this.f41028c = i11 + 1;
                bArr2[i11] = (byte) j10;
                this.f41029d++;
                return;
            }
            long j11 = this.f41028c;
            while ((j10 & (-128)) != 0) {
                byte[] bArr3 = this.f41026a;
                int i12 = this.f41028c;
                this.f41028c = i12 + 1;
                V.R(bArr3, i12, (byte) ((((int) j10) & 127) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT));
                j10 >>>= 7;
            }
            byte[] bArr4 = this.f41026a;
            int i13 = this.f41028c;
            this.f41028c = i13 + 1;
            V.R(bArr4, i13, (byte) j10);
            this.f41029d += (int) (((long) this.f41028c) - j11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final int getTotalBytesWritten() {
            return this.f41029d;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final int spaceLeft() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }
    }

    private static class c extends CodedOutputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final byte[] f41030a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f41031b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f41032c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f41033d;

        c(byte[] bArr, int i10, int i11) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            int i12 = i10 + i11;
            if ((i10 | i11 | (bArr.length - i12)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
            }
            this.f41030a = bArr;
            this.f41031b = i10;
            this.f41033d = i10;
            this.f41032c = i12;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void flush() {
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final int getTotalBytesWritten() {
            return this.f41033d - this.f41031b;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final int spaceLeft() {
            return this.f41032c - this.f41033d;
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public final void write(byte b10) throws OutOfSpaceException {
            try {
                byte[] bArr = this.f41030a;
                int i10 = this.f41033d;
                this.f41033d = i10 + 1;
                bArr[i10] = b10;
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f41033d), Integer.valueOf(this.f41032c), 1), e10);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeBool(int i10, boolean z9) throws OutOfSpaceException {
            writeTag(i10, 0);
            write(z9 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeByteArray(int i10, byte[] bArr) throws OutOfSpaceException {
            writeByteArray(i10, bArr, 0, bArr.length);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeByteArrayNoTag(byte[] bArr, int i10, int i11) throws OutOfSpaceException {
            writeUInt32NoTag(i11);
            write(bArr, i10, i11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeByteBuffer(int i10, ByteBuffer byteBuffer) throws OutOfSpaceException {
            writeTag(i10, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeBytes(int i10, ByteString byteString) throws OutOfSpaceException {
            writeTag(i10, 2);
            writeBytesNoTag(byteString);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeBytesNoTag(ByteString byteString) throws OutOfSpaceException {
            writeUInt32NoTag(byteString.size());
            byteString.writeTo(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeFixed32(int i10, int i11) throws OutOfSpaceException {
            writeTag(i10, 5);
            writeFixed32NoTag(i11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeFixed32NoTag(int i10) throws OutOfSpaceException {
            try {
                byte[] bArr = this.f41030a;
                int i11 = this.f41033d;
                int i12 = i11 + 1;
                this.f41033d = i12;
                bArr[i11] = (byte) (i10 & 255);
                int i13 = i11 + 2;
                this.f41033d = i13;
                bArr[i12] = (byte) ((i10 >> 8) & 255);
                int i14 = i11 + 3;
                this.f41033d = i14;
                bArr[i13] = (byte) ((i10 >> 16) & 255);
                this.f41033d = i11 + 4;
                bArr[i14] = (byte) ((i10 >> 24) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f41033d), Integer.valueOf(this.f41032c), 1), e10);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeFixed64(int i10, long j10) throws OutOfSpaceException {
            writeTag(i10, 1);
            writeFixed64NoTag(j10);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeFixed64NoTag(long j10) throws OutOfSpaceException {
            try {
                byte[] bArr = this.f41030a;
                int i10 = this.f41033d;
                int i11 = i10 + 1;
                this.f41033d = i11;
                bArr[i10] = (byte) (((int) j10) & 255);
                int i12 = i10 + 2;
                this.f41033d = i12;
                bArr[i11] = (byte) (((int) (j10 >> 8)) & 255);
                int i13 = i10 + 3;
                this.f41033d = i13;
                bArr[i12] = (byte) (((int) (j10 >> 16)) & 255);
                int i14 = i10 + 4;
                this.f41033d = i14;
                bArr[i13] = (byte) (((int) (j10 >> 24)) & 255);
                int i15 = i10 + 5;
                this.f41033d = i15;
                bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
                int i16 = i10 + 6;
                this.f41033d = i16;
                bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
                int i17 = i10 + 7;
                this.f41033d = i17;
                bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
                this.f41033d = i10 + 8;
                bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f41033d), Integer.valueOf(this.f41032c), 1), e10);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeInt32(int i10, int i11) throws OutOfSpaceException {
            writeTag(i10, 0);
            writeInt32NoTag(i11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeInt32NoTag(int i10) throws OutOfSpaceException {
            if (i10 >= 0) {
                writeUInt32NoTag(i10);
            } else {
                writeUInt64NoTag(i10);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public final void writeLazy(byte[] bArr, int i10, int i11) throws OutOfSpaceException {
            write(bArr, i10, i11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeMessage(int i10, MessageLite messageLite) throws OutOfSpaceException {
            writeTag(i10, 2);
            writeMessageNoTag(messageLite);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeMessageNoTag(MessageLite messageLite) throws OutOfSpaceException {
            writeUInt32NoTag(messageLite.getSerializedSize());
            messageLite.writeTo(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeMessageSetExtension(int i10, MessageLite messageLite) throws OutOfSpaceException {
            writeTag(1, 3);
            writeUInt32(2, i10);
            writeMessage(3, messageLite);
            writeTag(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeRawBytes(ByteBuffer byteBuffer) throws OutOfSpaceException {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            AbstractC6759q.a(byteBufferDuplicate);
            write(byteBufferDuplicate);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeRawMessageSetExtension(int i10, ByteString byteString) throws OutOfSpaceException {
            writeTag(1, 3);
            writeUInt32(2, i10);
            writeBytes(3, byteString);
            writeTag(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeString(int i10, String str) throws OutOfSpaceException {
            writeTag(i10, 2);
            writeStringNoTag(str);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeStringNoTag(String str) throws OutOfSpaceException {
            int i10 = this.f41033d;
            try {
                int iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(str.length() * 3);
                int iComputeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
                if (iComputeUInt32SizeNoTag2 != iComputeUInt32SizeNoTag) {
                    writeUInt32NoTag(W.k(str));
                    this.f41033d = W.i(str, this.f41030a, this.f41033d, spaceLeft());
                    return;
                }
                int i11 = i10 + iComputeUInt32SizeNoTag2;
                this.f41033d = i11;
                int i12 = W.i(str, this.f41030a, i11, spaceLeft());
                this.f41033d = i10;
                writeUInt32NoTag((i12 - i10) - iComputeUInt32SizeNoTag2);
                this.f41033d = i12;
            } catch (W.d e10) {
                this.f41033d = i10;
                inefficientWriteStringNoTag(str, e10);
            } catch (IndexOutOfBoundsException e11) {
                throw new OutOfSpaceException(e11);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeTag(int i10, int i11) throws OutOfSpaceException {
            writeUInt32NoTag(WireFormat.makeTag(i10, i11));
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeUInt32(int i10, int i11) throws OutOfSpaceException {
            writeTag(i10, 0);
            writeUInt32NoTag(i11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeUInt32NoTag(int i10) throws OutOfSpaceException {
            while ((i10 & (-128)) != 0) {
                try {
                    byte[] bArr = this.f41030a;
                    int i11 = this.f41033d;
                    this.f41033d = i11 + 1;
                    bArr[i11] = (byte) ((i10 & 127) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                    i10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f41033d), Integer.valueOf(this.f41032c), 1), e10);
                }
            }
            byte[] bArr2 = this.f41030a;
            int i12 = this.f41033d;
            this.f41033d = i12 + 1;
            bArr2[i12] = (byte) i10;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeUInt64(int i10, long j10) throws OutOfSpaceException {
            writeTag(i10, 0);
            writeUInt64NoTag(j10);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeUInt64NoTag(long j10) throws OutOfSpaceException {
            if (CodedOutputStream.HAS_UNSAFE_ARRAY_OPERATIONS && spaceLeft() >= 10) {
                while ((j10 & (-128)) != 0) {
                    byte[] bArr = this.f41030a;
                    int i10 = this.f41033d;
                    this.f41033d = i10 + 1;
                    V.R(bArr, i10, (byte) ((((int) j10) & 127) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT));
                    j10 >>>= 7;
                }
                byte[] bArr2 = this.f41030a;
                int i11 = this.f41033d;
                this.f41033d = i11 + 1;
                V.R(bArr2, i11, (byte) j10);
                return;
            }
            while ((j10 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f41030a;
                    int i12 = this.f41033d;
                    this.f41033d = i12 + 1;
                    bArr3[i12] = (byte) ((((int) j10) & 127) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                    j10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f41033d), Integer.valueOf(this.f41032c), 1), e10);
                }
            }
            byte[] bArr4 = this.f41030a;
            int i13 = this.f41033d;
            this.f41033d = i13 + 1;
            bArr4[i13] = (byte) j10;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public final void writeByteArray(int i10, byte[] bArr, int i11, int i12) throws OutOfSpaceException {
            writeTag(i10, 2);
            writeByteArrayNoTag(bArr, i11, i12);
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public final void writeLazy(ByteBuffer byteBuffer) throws OutOfSpaceException {
            write(byteBuffer);
        }

        @Override // com.google.protobuf.CodedOutputStream
        final void writeMessage(int i10, MessageLite messageLite, N n10) throws OutOfSpaceException {
            writeTag(i10, 2);
            writeUInt32NoTag(((AbstractMessageLite) messageLite).getSerializedSize(n10));
            n10.h(messageLite, this.wrapper);
        }

        @Override // com.google.protobuf.CodedOutputStream
        final void writeMessageNoTag(MessageLite messageLite, N n10) throws OutOfSpaceException {
            writeUInt32NoTag(((AbstractMessageLite) messageLite).getSerializedSize(n10));
            n10.h(messageLite, this.wrapper);
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public final void write(byte[] bArr, int i10, int i11) throws OutOfSpaceException {
            try {
                System.arraycopy(bArr, i10, this.f41030a, this.f41033d, i11);
                this.f41033d += i11;
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f41033d), Integer.valueOf(this.f41032c), Integer.valueOf(i11)), e10);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public final void write(ByteBuffer byteBuffer) throws OutOfSpaceException {
            int iRemaining = byteBuffer.remaining();
            try {
                byteBuffer.get(this.f41030a, this.f41033d, iRemaining);
                this.f41033d += iRemaining;
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f41033d), Integer.valueOf(this.f41032c), Integer.valueOf(iRemaining)), e10);
            }
        }
    }

    private static final class d extends b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final ByteOutput f41034e;

        d(ByteOutput byteOutput, int i10) {
            super(i10);
            if (byteOutput == null) {
                throw new NullPointerException("out");
            }
            this.f41034e = byteOutput;
        }

        private void h() {
            this.f41034e.write(this.f41026a, 0, this.f41028c);
            this.f41028c = 0;
        }

        private void i(int i10) {
            if (this.f41027b - this.f41028c < i10) {
                h();
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void flush() {
            if (this.f41028c > 0) {
                h();
            }
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void write(byte b10) {
            if (this.f41028c == this.f41027b) {
                h();
            }
            a(b10);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeBool(int i10, boolean z9) {
            i(11);
            e(i10, 0);
            a(z9 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteArray(int i10, byte[] bArr) {
            writeByteArray(i10, bArr, 0, bArr.length);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteArrayNoTag(byte[] bArr, int i10, int i11) {
            writeUInt32NoTag(i11);
            write(bArr, i10, i11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteBuffer(int i10, ByteBuffer byteBuffer) {
            writeTag(i10, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeBytes(int i10, ByteString byteString) {
            writeTag(i10, 2);
            writeBytesNoTag(byteString);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeBytesNoTag(ByteString byteString) {
            writeUInt32NoTag(byteString.size());
            byteString.writeTo(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed32(int i10, int i11) {
            i(14);
            e(i10, 5);
            b(i11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed32NoTag(int i10) {
            i(4);
            b(i10);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed64(int i10, long j10) {
            i(18);
            e(i10, 1);
            c(j10);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed64NoTag(long j10) {
            i(8);
            c(j10);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeInt32(int i10, int i11) {
            i(20);
            e(i10, 0);
            d(i11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeInt32NoTag(int i10) {
            if (i10 >= 0) {
                writeUInt32NoTag(i10);
            } else {
                writeUInt64NoTag(i10);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void writeLazy(byte[] bArr, int i10, int i11) {
            flush();
            this.f41034e.writeLazy(bArr, i10, i11);
            this.f41029d += i11;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeMessage(int i10, MessageLite messageLite) {
            writeTag(i10, 2);
            writeMessageNoTag(messageLite);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeMessageNoTag(MessageLite messageLite) {
            writeUInt32NoTag(messageLite.getSerializedSize());
            messageLite.writeTo(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeMessageSetExtension(int i10, MessageLite messageLite) {
            writeTag(1, 3);
            writeUInt32(2, i10);
            writeMessage(3, messageLite);
            writeTag(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeRawBytes(ByteBuffer byteBuffer) {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            AbstractC6759q.a(byteBufferDuplicate);
            write(byteBufferDuplicate);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeRawMessageSetExtension(int i10, ByteString byteString) {
            writeTag(1, 3);
            writeUInt32(2, i10);
            writeBytes(3, byteString);
            writeTag(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeString(int i10, String str) throws OutOfSpaceException {
            writeTag(i10, 2);
            writeStringNoTag(str);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeStringNoTag(String str) throws OutOfSpaceException {
            int length = str.length() * 3;
            int iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(length);
            int i10 = iComputeUInt32SizeNoTag + length;
            int i11 = this.f41027b;
            if (i10 > i11) {
                byte[] bArr = new byte[length];
                int i12 = W.i(str, bArr, 0, length);
                writeUInt32NoTag(i12);
                writeLazy(bArr, 0, i12);
                return;
            }
            if (i10 > i11 - this.f41028c) {
                h();
            }
            int i13 = this.f41028c;
            try {
                int iComputeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
                if (iComputeUInt32SizeNoTag2 != iComputeUInt32SizeNoTag) {
                    int iK = W.k(str);
                    f(iK);
                    this.f41028c = W.i(str, this.f41026a, this.f41028c, iK);
                    this.f41029d += iK;
                    return;
                }
                int i14 = i13 + iComputeUInt32SizeNoTag2;
                this.f41028c = i14;
                int i15 = W.i(str, this.f41026a, i14, this.f41027b - i14);
                this.f41028c = i13;
                int i16 = (i15 - i13) - iComputeUInt32SizeNoTag2;
                f(i16);
                this.f41028c = i15;
                this.f41029d += i16;
            } catch (W.d e10) {
                this.f41029d -= this.f41028c - i13;
                this.f41028c = i13;
                inefficientWriteStringNoTag(str, e10);
            } catch (IndexOutOfBoundsException e11) {
                throw new OutOfSpaceException(e11);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeTag(int i10, int i11) {
            writeUInt32NoTag(WireFormat.makeTag(i10, i11));
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt32(int i10, int i11) {
            i(20);
            e(i10, 0);
            f(i11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt32NoTag(int i10) {
            i(5);
            f(i10);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt64(int i10, long j10) {
            i(20);
            e(i10, 0);
            g(j10);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt64NoTag(long j10) {
            i(10);
            g(j10);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteArray(int i10, byte[] bArr, int i11, int i12) {
            writeTag(i10, 2);
            writeByteArrayNoTag(bArr, i11, i12);
        }

        @Override // com.google.protobuf.CodedOutputStream
        void writeMessage(int i10, MessageLite messageLite, N n10) {
            writeTag(i10, 2);
            writeMessageNoTag(messageLite, n10);
        }

        @Override // com.google.protobuf.CodedOutputStream
        void writeMessageNoTag(MessageLite messageLite, N n10) {
            writeUInt32NoTag(((AbstractMessageLite) messageLite).getSerializedSize(n10));
            n10.h(messageLite, this.wrapper);
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void write(byte[] bArr, int i10, int i11) {
            flush();
            this.f41034e.write(bArr, i10, i11);
            this.f41029d += i11;
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void writeLazy(ByteBuffer byteBuffer) {
            flush();
            int iRemaining = byteBuffer.remaining();
            this.f41034e.writeLazy(byteBuffer);
            this.f41029d += iRemaining;
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void write(ByteBuffer byteBuffer) {
            flush();
            int iRemaining = byteBuffer.remaining();
            this.f41034e.write(byteBuffer);
            this.f41029d += iRemaining;
        }
    }

    private static final class e extends c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final ByteBuffer f41035e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f41036f;

        e(ByteBuffer byteBuffer) {
            super(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            this.f41035e = byteBuffer;
            this.f41036f = byteBuffer.position();
        }

        @Override // com.google.protobuf.CodedOutputStream.c, com.google.protobuf.CodedOutputStream
        public void flush() {
            AbstractC6759q.d(this.f41035e, this.f41036f + getTotalBytesWritten());
        }
    }

    private static final class f extends b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final OutputStream f41037e;

        f(OutputStream outputStream, int i10) {
            super(i10);
            if (outputStream == null) {
                throw new NullPointerException("out");
            }
            this.f41037e = outputStream;
        }

        private void h() throws IOException {
            this.f41037e.write(this.f41026a, 0, this.f41028c);
            this.f41028c = 0;
        }

        private void i(int i10) throws IOException {
            if (this.f41027b - this.f41028c < i10) {
                h();
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void flush() throws IOException {
            if (this.f41028c > 0) {
                h();
            }
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void write(byte b10) throws IOException {
            if (this.f41028c == this.f41027b) {
                h();
            }
            a(b10);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeBool(int i10, boolean z9) throws IOException {
            i(11);
            e(i10, 0);
            a(z9 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteArray(int i10, byte[] bArr) throws IOException {
            writeByteArray(i10, bArr, 0, bArr.length);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteArrayNoTag(byte[] bArr, int i10, int i11) throws IOException {
            writeUInt32NoTag(i11);
            write(bArr, i10, i11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteBuffer(int i10, ByteBuffer byteBuffer) throws IOException {
            writeTag(i10, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeBytes(int i10, ByteString byteString) throws IOException {
            writeTag(i10, 2);
            writeBytesNoTag(byteString);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeBytesNoTag(ByteString byteString) throws IOException {
            writeUInt32NoTag(byteString.size());
            byteString.writeTo(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed32(int i10, int i11) throws IOException {
            i(14);
            e(i10, 5);
            b(i11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed32NoTag(int i10) throws IOException {
            i(4);
            b(i10);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed64(int i10, long j10) throws IOException {
            i(18);
            e(i10, 1);
            c(j10);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed64NoTag(long j10) throws IOException {
            i(8);
            c(j10);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeInt32(int i10, int i11) throws IOException {
            i(20);
            e(i10, 0);
            d(i11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeInt32NoTag(int i10) throws IOException {
            if (i10 >= 0) {
                writeUInt32NoTag(i10);
            } else {
                writeUInt64NoTag(i10);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void writeLazy(byte[] bArr, int i10, int i11) throws IOException {
            write(bArr, i10, i11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeMessage(int i10, MessageLite messageLite) throws IOException {
            writeTag(i10, 2);
            writeMessageNoTag(messageLite);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeMessageNoTag(MessageLite messageLite) throws IOException {
            writeUInt32NoTag(messageLite.getSerializedSize());
            messageLite.writeTo(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeMessageSetExtension(int i10, MessageLite messageLite) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i10);
            writeMessage(3, messageLite);
            writeTag(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeRawBytes(ByteBuffer byteBuffer) throws IOException {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            AbstractC6759q.a(byteBufferDuplicate);
            write(byteBufferDuplicate);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeRawMessageSetExtension(int i10, ByteString byteString) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i10);
            writeBytes(3, byteString);
            writeTag(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeString(int i10, String str) throws IOException {
            writeTag(i10, 2);
            writeStringNoTag(str);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeStringNoTag(String str) throws IOException {
            int iK;
            try {
                int length = str.length() * 3;
                int iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(length);
                int i10 = iComputeUInt32SizeNoTag + length;
                int i11 = this.f41027b;
                if (i10 > i11) {
                    byte[] bArr = new byte[length];
                    int i12 = W.i(str, bArr, 0, length);
                    writeUInt32NoTag(i12);
                    writeLazy(bArr, 0, i12);
                    return;
                }
                if (i10 > i11 - this.f41028c) {
                    h();
                }
                int iComputeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
                int i13 = this.f41028c;
                try {
                    if (iComputeUInt32SizeNoTag2 == iComputeUInt32SizeNoTag) {
                        int i14 = i13 + iComputeUInt32SizeNoTag2;
                        this.f41028c = i14;
                        int i15 = W.i(str, this.f41026a, i14, this.f41027b - i14);
                        this.f41028c = i13;
                        iK = (i15 - i13) - iComputeUInt32SizeNoTag2;
                        f(iK);
                        this.f41028c = i15;
                    } else {
                        iK = W.k(str);
                        f(iK);
                        this.f41028c = W.i(str, this.f41026a, this.f41028c, iK);
                    }
                    this.f41029d += iK;
                } catch (W.d e10) {
                    this.f41029d -= this.f41028c - i13;
                    this.f41028c = i13;
                    throw e10;
                } catch (ArrayIndexOutOfBoundsException e11) {
                    throw new OutOfSpaceException(e11);
                }
            } catch (W.d e12) {
                inefficientWriteStringNoTag(str, e12);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeTag(int i10, int i11) throws IOException {
            writeUInt32NoTag(WireFormat.makeTag(i10, i11));
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt32(int i10, int i11) throws IOException {
            i(20);
            e(i10, 0);
            f(i11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt32NoTag(int i10) throws IOException {
            i(5);
            f(i10);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt64(int i10, long j10) throws IOException {
            i(20);
            e(i10, 0);
            g(j10);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt64NoTag(long j10) throws IOException {
            i(10);
            g(j10);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteArray(int i10, byte[] bArr, int i11, int i12) throws IOException {
            writeTag(i10, 2);
            writeByteArrayNoTag(bArr, i11, i12);
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void writeLazy(ByteBuffer byteBuffer) throws IOException {
            write(byteBuffer);
        }

        @Override // com.google.protobuf.CodedOutputStream
        void writeMessage(int i10, MessageLite messageLite, N n10) throws IOException {
            writeTag(i10, 2);
            writeMessageNoTag(messageLite, n10);
        }

        @Override // com.google.protobuf.CodedOutputStream
        void writeMessageNoTag(MessageLite messageLite, N n10) throws IOException {
            writeUInt32NoTag(((AbstractMessageLite) messageLite).getSerializedSize(n10));
            n10.h(messageLite, this.wrapper);
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void write(byte[] bArr, int i10, int i11) throws IOException {
            int i12 = this.f41027b;
            int i13 = this.f41028c;
            if (i12 - i13 >= i11) {
                System.arraycopy(bArr, i10, this.f41026a, i13, i11);
                this.f41028c += i11;
                this.f41029d += i11;
                return;
            }
            int i14 = i12 - i13;
            System.arraycopy(bArr, i10, this.f41026a, i13, i14);
            int i15 = i10 + i14;
            int i16 = i11 - i14;
            this.f41028c = this.f41027b;
            this.f41029d += i14;
            h();
            if (i16 <= this.f41027b) {
                System.arraycopy(bArr, i15, this.f41026a, 0, i16);
                this.f41028c = i16;
            } else {
                this.f41037e.write(bArr, i15, i16);
            }
            this.f41029d += i16;
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void write(ByteBuffer byteBuffer) throws IOException {
            int iRemaining = byteBuffer.remaining();
            int i10 = this.f41027b;
            int i11 = this.f41028c;
            if (i10 - i11 >= iRemaining) {
                byteBuffer.get(this.f41026a, i11, iRemaining);
                this.f41028c += iRemaining;
                this.f41029d += iRemaining;
                return;
            }
            int i12 = i10 - i11;
            byteBuffer.get(this.f41026a, i11, i12);
            int i13 = iRemaining - i12;
            this.f41028c = this.f41027b;
            this.f41029d += i12;
            h();
            while (true) {
                int i14 = this.f41027b;
                if (i13 > i14) {
                    byteBuffer.get(this.f41026a, 0, i14);
                    this.f41037e.write(this.f41026a, 0, this.f41027b);
                    int i15 = this.f41027b;
                    i13 -= i15;
                    this.f41029d += i15;
                } else {
                    byteBuffer.get(this.f41026a, 0, i13);
                    this.f41028c = i13;
                    this.f41029d += i13;
                    return;
                }
            }
        }
    }

    private static final class g extends CodedOutputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ByteBuffer f41038a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ByteBuffer f41039b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f41040c;

        g(ByteBuffer byteBuffer) {
            super();
            this.f41038a = byteBuffer;
            this.f41039b = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            this.f41040c = byteBuffer.position();
        }

        private void a(String str) throws OutOfSpaceException {
            try {
                W.j(str, this.f41039b);
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(e10);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void flush() {
            AbstractC6759q.d(this.f41038a, this.f41039b.position());
        }

        @Override // com.google.protobuf.CodedOutputStream
        public int getTotalBytesWritten() {
            return this.f41039b.position() - this.f41040c;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public int spaceLeft() {
            return this.f41039b.remaining();
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void write(byte b10) throws OutOfSpaceException {
            try {
                this.f41039b.put(b10);
            } catch (BufferOverflowException e10) {
                throw new OutOfSpaceException(e10);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeBool(int i10, boolean z9) throws OutOfSpaceException {
            writeTag(i10, 0);
            write(z9 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteArray(int i10, byte[] bArr) throws OutOfSpaceException {
            writeByteArray(i10, bArr, 0, bArr.length);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteArrayNoTag(byte[] bArr, int i10, int i11) throws OutOfSpaceException {
            writeUInt32NoTag(i11);
            write(bArr, i10, i11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteBuffer(int i10, ByteBuffer byteBuffer) throws OutOfSpaceException {
            writeTag(i10, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeBytes(int i10, ByteString byteString) throws OutOfSpaceException {
            writeTag(i10, 2);
            writeBytesNoTag(byteString);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeBytesNoTag(ByteString byteString) throws OutOfSpaceException {
            writeUInt32NoTag(byteString.size());
            byteString.writeTo(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed32(int i10, int i11) throws OutOfSpaceException {
            writeTag(i10, 5);
            writeFixed32NoTag(i11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed32NoTag(int i10) throws OutOfSpaceException {
            try {
                this.f41039b.putInt(i10);
            } catch (BufferOverflowException e10) {
                throw new OutOfSpaceException(e10);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed64(int i10, long j10) throws OutOfSpaceException {
            writeTag(i10, 1);
            writeFixed64NoTag(j10);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed64NoTag(long j10) throws OutOfSpaceException {
            try {
                this.f41039b.putLong(j10);
            } catch (BufferOverflowException e10) {
                throw new OutOfSpaceException(e10);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeInt32(int i10, int i11) throws OutOfSpaceException {
            writeTag(i10, 0);
            writeInt32NoTag(i11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeInt32NoTag(int i10) throws OutOfSpaceException {
            if (i10 >= 0) {
                writeUInt32NoTag(i10);
            } else {
                writeUInt64NoTag(i10);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void writeLazy(byte[] bArr, int i10, int i11) throws OutOfSpaceException {
            write(bArr, i10, i11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeMessage(int i10, MessageLite messageLite) throws OutOfSpaceException {
            writeTag(i10, 2);
            writeMessageNoTag(messageLite);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeMessageNoTag(MessageLite messageLite) throws OutOfSpaceException {
            writeUInt32NoTag(messageLite.getSerializedSize());
            messageLite.writeTo(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeMessageSetExtension(int i10, MessageLite messageLite) throws OutOfSpaceException {
            writeTag(1, 3);
            writeUInt32(2, i10);
            writeMessage(3, messageLite);
            writeTag(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeRawBytes(ByteBuffer byteBuffer) throws OutOfSpaceException {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            AbstractC6759q.a(byteBufferDuplicate);
            write(byteBufferDuplicate);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeRawMessageSetExtension(int i10, ByteString byteString) throws OutOfSpaceException {
            writeTag(1, 3);
            writeUInt32(2, i10);
            writeBytes(3, byteString);
            writeTag(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeString(int i10, String str) throws OutOfSpaceException {
            writeTag(i10, 2);
            writeStringNoTag(str);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeStringNoTag(String str) throws OutOfSpaceException {
            int iPosition = this.f41039b.position();
            try {
                int iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(str.length() * 3);
                int iComputeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
                if (iComputeUInt32SizeNoTag2 != iComputeUInt32SizeNoTag) {
                    writeUInt32NoTag(W.k(str));
                    a(str);
                    return;
                }
                int iPosition2 = this.f41039b.position() + iComputeUInt32SizeNoTag2;
                AbstractC6759q.d(this.f41039b, iPosition2);
                a(str);
                int iPosition3 = this.f41039b.position();
                AbstractC6759q.d(this.f41039b, iPosition);
                writeUInt32NoTag(iPosition3 - iPosition2);
                AbstractC6759q.d(this.f41039b, iPosition3);
            } catch (W.d e10) {
                AbstractC6759q.d(this.f41039b, iPosition);
                inefficientWriteStringNoTag(str, e10);
            } catch (IllegalArgumentException e11) {
                throw new OutOfSpaceException(e11);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeTag(int i10, int i11) throws OutOfSpaceException {
            writeUInt32NoTag(WireFormat.makeTag(i10, i11));
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt32(int i10, int i11) throws OutOfSpaceException {
            writeTag(i10, 0);
            writeUInt32NoTag(i11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt32NoTag(int i10) throws OutOfSpaceException {
            while ((i10 & (-128)) != 0) {
                try {
                    this.f41039b.put((byte) ((i10 & 127) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT));
                    i10 >>>= 7;
                } catch (BufferOverflowException e10) {
                    throw new OutOfSpaceException(e10);
                }
            }
            this.f41039b.put((byte) i10);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt64(int i10, long j10) throws OutOfSpaceException {
            writeTag(i10, 0);
            writeUInt64NoTag(j10);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt64NoTag(long j10) throws OutOfSpaceException {
            while (((-128) & j10) != 0) {
                try {
                    this.f41039b.put((byte) ((((int) j10) & 127) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT));
                    j10 >>>= 7;
                } catch (BufferOverflowException e10) {
                    throw new OutOfSpaceException(e10);
                }
            }
            this.f41039b.put((byte) j10);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteArray(int i10, byte[] bArr, int i11, int i12) throws OutOfSpaceException {
            writeTag(i10, 2);
            writeByteArrayNoTag(bArr, i11, i12);
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void writeLazy(ByteBuffer byteBuffer) throws OutOfSpaceException {
            write(byteBuffer);
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void write(byte[] bArr, int i10, int i11) throws OutOfSpaceException {
            try {
                this.f41039b.put(bArr, i10, i11);
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(e10);
            } catch (BufferOverflowException e11) {
                throw new OutOfSpaceException(e11);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        void writeMessage(int i10, MessageLite messageLite, N n10) throws OutOfSpaceException {
            writeTag(i10, 2);
            writeMessageNoTag(messageLite, n10);
        }

        @Override // com.google.protobuf.CodedOutputStream
        void writeMessageNoTag(MessageLite messageLite, N n10) throws OutOfSpaceException {
            writeUInt32NoTag(((AbstractMessageLite) messageLite).getSerializedSize(n10));
            n10.h(messageLite, this.wrapper);
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void write(ByteBuffer byteBuffer) throws OutOfSpaceException {
            try {
                this.f41039b.put(byteBuffer);
            } catch (BufferOverflowException e10) {
                throw new OutOfSpaceException(e10);
            }
        }
    }

    private static final class h extends CodedOutputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ByteBuffer f41041a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ByteBuffer f41042b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f41043c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f41044d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final long f41045e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final long f41046f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f41047g;

        h(ByteBuffer byteBuffer) {
            super();
            this.f41041a = byteBuffer;
            this.f41042b = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            long jK = V.k(byteBuffer);
            this.f41043c = jK;
            long jPosition = ((long) byteBuffer.position()) + jK;
            this.f41044d = jPosition;
            long jLimit = jK + ((long) byteBuffer.limit());
            this.f41045e = jLimit;
            this.f41046f = jLimit - 10;
            this.f41047g = jPosition;
        }

        private int a(long j10) {
            return (int) (j10 - this.f41043c);
        }

        static boolean b() {
            return V.K();
        }

        private void c(long j10) {
            AbstractC6759q.d(this.f41042b, a(j10));
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void flush() {
            AbstractC6759q.d(this.f41041a, a(this.f41047g));
        }

        @Override // com.google.protobuf.CodedOutputStream
        public int getTotalBytesWritten() {
            return (int) (this.f41047g - this.f41044d);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public int spaceLeft() {
            return (int) (this.f41045e - this.f41047g);
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void write(byte b10) throws OutOfSpaceException {
            long j10 = this.f41047g;
            if (j10 >= this.f41045e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f41047g), Long.valueOf(this.f41045e), 1));
            }
            this.f41047g = 1 + j10;
            V.Q(j10, b10);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeBool(int i10, boolean z9) throws OutOfSpaceException {
            writeTag(i10, 0);
            write(z9 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteArray(int i10, byte[] bArr) throws OutOfSpaceException {
            writeByteArray(i10, bArr, 0, bArr.length);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteArrayNoTag(byte[] bArr, int i10, int i11) throws OutOfSpaceException {
            writeUInt32NoTag(i11);
            write(bArr, i10, i11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteBuffer(int i10, ByteBuffer byteBuffer) throws OutOfSpaceException {
            writeTag(i10, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeBytes(int i10, ByteString byteString) throws OutOfSpaceException {
            writeTag(i10, 2);
            writeBytesNoTag(byteString);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeBytesNoTag(ByteString byteString) throws OutOfSpaceException {
            writeUInt32NoTag(byteString.size());
            byteString.writeTo(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed32(int i10, int i11) throws OutOfSpaceException {
            writeTag(i10, 5);
            writeFixed32NoTag(i11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed32NoTag(int i10) {
            this.f41042b.putInt(a(this.f41047g), i10);
            this.f41047g += 4;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed64(int i10, long j10) throws OutOfSpaceException {
            writeTag(i10, 1);
            writeFixed64NoTag(j10);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeFixed64NoTag(long j10) {
            this.f41042b.putLong(a(this.f41047g), j10);
            this.f41047g += 8;
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeInt32(int i10, int i11) throws OutOfSpaceException {
            writeTag(i10, 0);
            writeInt32NoTag(i11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeInt32NoTag(int i10) throws OutOfSpaceException {
            if (i10 >= 0) {
                writeUInt32NoTag(i10);
            } else {
                writeUInt64NoTag(i10);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void writeLazy(byte[] bArr, int i10, int i11) throws OutOfSpaceException {
            write(bArr, i10, i11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeMessage(int i10, MessageLite messageLite) throws OutOfSpaceException {
            writeTag(i10, 2);
            writeMessageNoTag(messageLite);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeMessageNoTag(MessageLite messageLite) throws OutOfSpaceException {
            writeUInt32NoTag(messageLite.getSerializedSize());
            messageLite.writeTo(this);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeMessageSetExtension(int i10, MessageLite messageLite) throws OutOfSpaceException {
            writeTag(1, 3);
            writeUInt32(2, i10);
            writeMessage(3, messageLite);
            writeTag(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeRawBytes(ByteBuffer byteBuffer) throws OutOfSpaceException {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            AbstractC6759q.a(byteBufferDuplicate);
            write(byteBufferDuplicate);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeRawMessageSetExtension(int i10, ByteString byteString) throws OutOfSpaceException {
            writeTag(1, 3);
            writeUInt32(2, i10);
            writeBytes(3, byteString);
            writeTag(1, 4);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeString(int i10, String str) throws OutOfSpaceException {
            writeTag(i10, 2);
            writeStringNoTag(str);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeStringNoTag(String str) throws OutOfSpaceException {
            long j10 = this.f41047g;
            try {
                int iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(str.length() * 3);
                int iComputeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
                if (iComputeUInt32SizeNoTag2 != iComputeUInt32SizeNoTag) {
                    int iK = W.k(str);
                    writeUInt32NoTag(iK);
                    c(this.f41047g);
                    W.j(str, this.f41042b);
                    this.f41047g += (long) iK;
                    return;
                }
                int iA = a(this.f41047g) + iComputeUInt32SizeNoTag2;
                AbstractC6759q.d(this.f41042b, iA);
                W.j(str, this.f41042b);
                int iPosition = this.f41042b.position() - iA;
                writeUInt32NoTag(iPosition);
                this.f41047g += (long) iPosition;
            } catch (W.d e10) {
                this.f41047g = j10;
                c(j10);
                inefficientWriteStringNoTag(str, e10);
            } catch (IllegalArgumentException e11) {
                throw new OutOfSpaceException(e11);
            } catch (IndexOutOfBoundsException e12) {
                throw new OutOfSpaceException(e12);
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeTag(int i10, int i11) throws OutOfSpaceException {
            writeUInt32NoTag(WireFormat.makeTag(i10, i11));
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt32(int i10, int i11) throws OutOfSpaceException {
            writeTag(i10, 0);
            writeUInt32NoTag(i11);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt32NoTag(int i10) throws OutOfSpaceException {
            if (this.f41047g <= this.f41046f) {
                while ((i10 & (-128)) != 0) {
                    long j10 = this.f41047g;
                    this.f41047g = j10 + 1;
                    V.Q(j10, (byte) ((i10 & 127) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT));
                    i10 >>>= 7;
                }
                long j11 = this.f41047g;
                this.f41047g = 1 + j11;
                V.Q(j11, (byte) i10);
                return;
            }
            while (true) {
                long j12 = this.f41047g;
                if (j12 >= this.f41045e) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f41047g), Long.valueOf(this.f41045e), 1));
                }
                if ((i10 & (-128)) == 0) {
                    this.f41047g = 1 + j12;
                    V.Q(j12, (byte) i10);
                    return;
                } else {
                    this.f41047g = j12 + 1;
                    V.Q(j12, (byte) ((i10 & 127) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT));
                    i10 >>>= 7;
                }
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt64(int i10, long j10) throws OutOfSpaceException {
            writeTag(i10, 0);
            writeUInt64NoTag(j10);
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeUInt64NoTag(long j10) throws OutOfSpaceException {
            if (this.f41047g <= this.f41046f) {
                while ((j10 & (-128)) != 0) {
                    long j11 = this.f41047g;
                    this.f41047g = j11 + 1;
                    V.Q(j11, (byte) ((((int) j10) & 127) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT));
                    j10 >>>= 7;
                }
                long j12 = this.f41047g;
                this.f41047g = 1 + j12;
                V.Q(j12, (byte) j10);
                return;
            }
            while (true) {
                long j13 = this.f41047g;
                if (j13 >= this.f41045e) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f41047g), Long.valueOf(this.f41045e), 1));
                }
                if ((j10 & (-128)) == 0) {
                    this.f41047g = 1 + j13;
                    V.Q(j13, (byte) j10);
                    return;
                } else {
                    this.f41047g = j13 + 1;
                    V.Q(j13, (byte) ((((int) j10) & 127) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT));
                    j10 >>>= 7;
                }
            }
        }

        @Override // com.google.protobuf.CodedOutputStream
        public void writeByteArray(int i10, byte[] bArr, int i11, int i12) throws OutOfSpaceException {
            writeTag(i10, 2);
            writeByteArrayNoTag(bArr, i11, i12);
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void writeLazy(ByteBuffer byteBuffer) throws OutOfSpaceException {
            write(byteBuffer);
        }

        @Override // com.google.protobuf.CodedOutputStream
        void writeMessage(int i10, MessageLite messageLite, N n10) throws OutOfSpaceException {
            writeTag(i10, 2);
            writeMessageNoTag(messageLite, n10);
        }

        @Override // com.google.protobuf.CodedOutputStream
        void writeMessageNoTag(MessageLite messageLite, N n10) throws OutOfSpaceException {
            writeUInt32NoTag(((AbstractMessageLite) messageLite).getSerializedSize(n10));
            n10.h(messageLite, this.wrapper);
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void write(byte[] bArr, int i10, int i11) throws OutOfSpaceException {
            if (bArr != null && i10 >= 0 && i11 >= 0 && bArr.length - i11 >= i10) {
                long j10 = i11;
                long j11 = this.f41045e - j10;
                long j12 = this.f41047g;
                if (j11 >= j12) {
                    V.q(bArr, i10, j12, j10);
                    this.f41047g += j10;
                    return;
                }
            }
            if (bArr == null) {
                throw new NullPointerException("value");
            }
            throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f41047g), Long.valueOf(this.f41045e), Integer.valueOf(i11)));
        }

        @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
        public void write(ByteBuffer byteBuffer) throws OutOfSpaceException {
            try {
                int iRemaining = byteBuffer.remaining();
                c(this.f41047g);
                this.f41042b.put(byteBuffer);
                this.f41047g += (long) iRemaining;
            } catch (BufferOverflowException e10) {
                throw new OutOfSpaceException(e10);
            }
        }
    }

    public static int computeBoolSize(int i10, boolean z9) {
        return computeTagSize(i10) + computeBoolSizeNoTag(z9);
    }

    public static int computeBoolSizeNoTag(boolean z9) {
        return 1;
    }

    public static int computeByteArraySize(int i10, byte[] bArr) {
        return computeTagSize(i10) + computeByteArraySizeNoTag(bArr);
    }

    public static int computeByteArraySizeNoTag(byte[] bArr) {
        return computeLengthDelimitedFieldSize(bArr.length);
    }

    public static int computeByteBufferSize(int i10, ByteBuffer byteBuffer) {
        return computeTagSize(i10) + computeByteBufferSizeNoTag(byteBuffer);
    }

    public static int computeByteBufferSizeNoTag(ByteBuffer byteBuffer) {
        return computeLengthDelimitedFieldSize(byteBuffer.capacity());
    }

    public static int computeBytesSize(int i10, ByteString byteString) {
        return computeTagSize(i10) + computeBytesSizeNoTag(byteString);
    }

    public static int computeBytesSizeNoTag(ByteString byteString) {
        return computeLengthDelimitedFieldSize(byteString.size());
    }

    public static int computeDoubleSize(int i10, double d10) {
        return computeTagSize(i10) + computeDoubleSizeNoTag(d10);
    }

    public static int computeDoubleSizeNoTag(double d10) {
        return 8;
    }

    public static int computeEnumSize(int i10, int i11) {
        return computeTagSize(i10) + computeEnumSizeNoTag(i11);
    }

    public static int computeEnumSizeNoTag(int i10) {
        return computeInt32SizeNoTag(i10);
    }

    public static int computeFixed32Size(int i10, int i11) {
        return computeTagSize(i10) + computeFixed32SizeNoTag(i11);
    }

    public static int computeFixed32SizeNoTag(int i10) {
        return 4;
    }

    public static int computeFixed64Size(int i10, long j10) {
        return computeTagSize(i10) + computeFixed64SizeNoTag(j10);
    }

    public static int computeFixed64SizeNoTag(long j10) {
        return 8;
    }

    public static int computeFloatSize(int i10, float f10) {
        return computeTagSize(i10) + computeFloatSizeNoTag(f10);
    }

    public static int computeFloatSizeNoTag(float f10) {
        return 4;
    }

    @Deprecated
    public static int computeGroupSize(int i10, MessageLite messageLite) {
        return (computeTagSize(i10) * 2) + messageLite.getSerializedSize();
    }

    @Deprecated
    public static int computeGroupSizeNoTag(MessageLite messageLite) {
        return messageLite.getSerializedSize();
    }

    public static int computeInt32Size(int i10, int i11) {
        return computeTagSize(i10) + computeInt32SizeNoTag(i11);
    }

    public static int computeInt32SizeNoTag(int i10) {
        if (i10 >= 0) {
            return computeUInt32SizeNoTag(i10);
        }
        return 10;
    }

    public static int computeInt64Size(int i10, long j10) {
        return computeTagSize(i10) + computeInt64SizeNoTag(j10);
    }

    public static int computeInt64SizeNoTag(long j10) {
        return computeUInt64SizeNoTag(j10);
    }

    public static int computeLazyFieldMessageSetExtensionSize(int i10, LazyFieldLite lazyFieldLite) {
        return (computeTagSize(1) * 2) + computeUInt32Size(2, i10) + computeLazyFieldSize(3, lazyFieldLite);
    }

    public static int computeLazyFieldSize(int i10, LazyFieldLite lazyFieldLite) {
        return computeTagSize(i10) + computeLazyFieldSizeNoTag(lazyFieldLite);
    }

    public static int computeLazyFieldSizeNoTag(LazyFieldLite lazyFieldLite) {
        return computeLengthDelimitedFieldSize(lazyFieldLite.getSerializedSize());
    }

    static int computeLengthDelimitedFieldSize(int i10) {
        return computeUInt32SizeNoTag(i10) + i10;
    }

    public static int computeMessageSetExtensionSize(int i10, MessageLite messageLite) {
        return (computeTagSize(1) * 2) + computeUInt32Size(2, i10) + computeMessageSize(3, messageLite);
    }

    public static int computeMessageSize(int i10, MessageLite messageLite) {
        return computeTagSize(i10) + computeMessageSizeNoTag(messageLite);
    }

    public static int computeMessageSizeNoTag(MessageLite messageLite) {
        return computeLengthDelimitedFieldSize(messageLite.getSerializedSize());
    }

    static int computePreferredBufferSize(int i10) {
        return i10 > 4096 ? DEFAULT_BUFFER_SIZE : i10;
    }

    public static int computeRawMessageSetExtensionSize(int i10, ByteString byteString) {
        return (computeTagSize(1) * 2) + computeUInt32Size(2, i10) + computeBytesSize(3, byteString);
    }

    @Deprecated
    public static int computeRawVarint32Size(int i10) {
        return computeUInt32SizeNoTag(i10);
    }

    @Deprecated
    public static int computeRawVarint64Size(long j10) {
        return computeUInt64SizeNoTag(j10);
    }

    public static int computeSFixed32Size(int i10, int i11) {
        return computeTagSize(i10) + computeSFixed32SizeNoTag(i11);
    }

    public static int computeSFixed32SizeNoTag(int i10) {
        return 4;
    }

    public static int computeSFixed64Size(int i10, long j10) {
        return computeTagSize(i10) + computeSFixed64SizeNoTag(j10);
    }

    public static int computeSFixed64SizeNoTag(long j10) {
        return 8;
    }

    public static int computeSInt32Size(int i10, int i11) {
        return computeTagSize(i10) + computeSInt32SizeNoTag(i11);
    }

    public static int computeSInt32SizeNoTag(int i10) {
        return computeUInt32SizeNoTag(encodeZigZag32(i10));
    }

    public static int computeSInt64Size(int i10, long j10) {
        return computeTagSize(i10) + computeSInt64SizeNoTag(j10);
    }

    public static int computeSInt64SizeNoTag(long j10) {
        return computeUInt64SizeNoTag(encodeZigZag64(j10));
    }

    public static int computeStringSize(int i10, String str) {
        return computeTagSize(i10) + computeStringSizeNoTag(str);
    }

    public static int computeStringSizeNoTag(String str) {
        int length;
        try {
            length = W.k(str);
        } catch (W.d unused) {
            length = str.getBytes(Internal.UTF_8).length;
        }
        return computeLengthDelimitedFieldSize(length);
    }

    public static int computeTagSize(int i10) {
        return computeUInt32SizeNoTag(WireFormat.makeTag(i10, 0));
    }

    public static int computeUInt32Size(int i10, int i11) {
        return computeTagSize(i10) + computeUInt32SizeNoTag(i11);
    }

    public static int computeUInt32SizeNoTag(int i10) {
        if ((i10 & (-128)) == 0) {
            return 1;
        }
        if ((i10 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i10) == 0) {
            return 3;
        }
        return (i10 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int computeUInt64Size(int i10, long j10) {
        return computeTagSize(i10) + computeUInt64SizeNoTag(j10);
    }

    public static int computeUInt64SizeNoTag(long j10) {
        int i10;
        if (((-128) & j10) == 0) {
            return 1;
        }
        if (j10 < 0) {
            return 10;
        }
        if (((-34359738368L) & j10) != 0) {
            j10 >>>= 28;
            i10 = 6;
        } else {
            i10 = 2;
        }
        if (((-2097152) & j10) != 0) {
            i10 += 2;
            j10 >>>= 14;
        }
        return (j10 & (-16384)) != 0 ? i10 + 1 : i10;
    }

    public static int encodeZigZag32(int i10) {
        return (i10 >> 31) ^ (i10 << 1);
    }

    public static long encodeZigZag64(long j10) {
        return (j10 >> 63) ^ (j10 << 1);
    }

    public static CodedOutputStream newInstance(OutputStream outputStream) {
        return newInstance(outputStream, DEFAULT_BUFFER_SIZE);
    }

    static CodedOutputStream newSafeInstance(ByteBuffer byteBuffer) {
        return new g(byteBuffer);
    }

    static CodedOutputStream newUnsafeInstance(ByteBuffer byteBuffer) {
        return new h(byteBuffer);
    }

    public final void checkNoSpaceLeft() {
        if (spaceLeft() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public abstract void flush();

    public abstract int getTotalBytesWritten();

    final void inefficientWriteStringNoTag(String str, W.d dVar) throws OutOfSpaceException {
        logger.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) dVar);
        byte[] bytes = str.getBytes(Internal.UTF_8);
        try {
            writeUInt32NoTag(bytes.length);
            writeLazy(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e10) {
            throw new OutOfSpaceException(e10);
        }
    }

    boolean isSerializationDeterministic() {
        return this.serializationDeterministic;
    }

    public abstract int spaceLeft();

    public void useDeterministicSerialization() {
        this.serializationDeterministic = true;
    }

    @Override // com.google.protobuf.ByteOutput
    public abstract void write(byte b10);

    @Override // com.google.protobuf.ByteOutput
    public abstract void write(ByteBuffer byteBuffer);

    @Override // com.google.protobuf.ByteOutput
    public abstract void write(byte[] bArr, int i10, int i11);

    public abstract void writeBool(int i10, boolean z9);

    public final void writeBoolNoTag(boolean z9) {
        write(z9 ? (byte) 1 : (byte) 0);
    }

    public abstract void writeByteArray(int i10, byte[] bArr);

    public abstract void writeByteArray(int i10, byte[] bArr, int i11, int i12);

    public final void writeByteArrayNoTag(byte[] bArr) {
        writeByteArrayNoTag(bArr, 0, bArr.length);
    }

    abstract void writeByteArrayNoTag(byte[] bArr, int i10, int i11);

    public abstract void writeByteBuffer(int i10, ByteBuffer byteBuffer);

    public abstract void writeBytes(int i10, ByteString byteString);

    public abstract void writeBytesNoTag(ByteString byteString);

    public final void writeDouble(int i10, double d10) {
        writeFixed64(i10, Double.doubleToRawLongBits(d10));
    }

    public final void writeDoubleNoTag(double d10) {
        writeFixed64NoTag(Double.doubleToRawLongBits(d10));
    }

    public final void writeEnum(int i10, int i11) {
        writeInt32(i10, i11);
    }

    public final void writeEnumNoTag(int i10) {
        writeInt32NoTag(i10);
    }

    public abstract void writeFixed32(int i10, int i11);

    public abstract void writeFixed32NoTag(int i10);

    public abstract void writeFixed64(int i10, long j10);

    public abstract void writeFixed64NoTag(long j10);

    public final void writeFloat(int i10, float f10) {
        writeFixed32(i10, Float.floatToRawIntBits(f10));
    }

    public final void writeFloatNoTag(float f10) {
        writeFixed32NoTag(Float.floatToRawIntBits(f10));
    }

    @Deprecated
    public final void writeGroup(int i10, MessageLite messageLite) {
        writeTag(i10, 3);
        writeGroupNoTag(messageLite);
        writeTag(i10, 4);
    }

    @Deprecated
    public final void writeGroupNoTag(MessageLite messageLite) {
        messageLite.writeTo(this);
    }

    public abstract void writeInt32(int i10, int i11);

    public abstract void writeInt32NoTag(int i10);

    public final void writeInt64(int i10, long j10) {
        writeUInt64(i10, j10);
    }

    public final void writeInt64NoTag(long j10) {
        writeUInt64NoTag(j10);
    }

    @Override // com.google.protobuf.ByteOutput
    public abstract void writeLazy(ByteBuffer byteBuffer);

    @Override // com.google.protobuf.ByteOutput
    public abstract void writeLazy(byte[] bArr, int i10, int i11);

    public abstract void writeMessage(int i10, MessageLite messageLite);

    abstract void writeMessage(int i10, MessageLite messageLite, N n10);

    public abstract void writeMessageNoTag(MessageLite messageLite);

    abstract void writeMessageNoTag(MessageLite messageLite, N n10);

    public abstract void writeMessageSetExtension(int i10, MessageLite messageLite);

    public final void writeRawByte(byte b10) {
        write(b10);
    }

    public abstract void writeRawBytes(ByteBuffer byteBuffer);

    public final void writeRawBytes(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Deprecated
    public final void writeRawLittleEndian32(int i10) {
        writeFixed32NoTag(i10);
    }

    @Deprecated
    public final void writeRawLittleEndian64(long j10) {
        writeFixed64NoTag(j10);
    }

    public abstract void writeRawMessageSetExtension(int i10, ByteString byteString);

    @Deprecated
    public final void writeRawVarint32(int i10) {
        writeUInt32NoTag(i10);
    }

    @Deprecated
    public final void writeRawVarint64(long j10) {
        writeUInt64NoTag(j10);
    }

    public final void writeSFixed32(int i10, int i11) {
        writeFixed32(i10, i11);
    }

    public final void writeSFixed32NoTag(int i10) {
        writeFixed32NoTag(i10);
    }

    public final void writeSFixed64(int i10, long j10) {
        writeFixed64(i10, j10);
    }

    public final void writeSFixed64NoTag(long j10) {
        writeFixed64NoTag(j10);
    }

    public final void writeSInt32(int i10, int i11) {
        writeUInt32(i10, encodeZigZag32(i11));
    }

    public final void writeSInt32NoTag(int i10) {
        writeUInt32NoTag(encodeZigZag32(i10));
    }

    public final void writeSInt64(int i10, long j10) {
        writeUInt64(i10, encodeZigZag64(j10));
    }

    public final void writeSInt64NoTag(long j10) {
        writeUInt64NoTag(encodeZigZag64(j10));
    }

    public abstract void writeString(int i10, String str);

    public abstract void writeStringNoTag(String str);

    public abstract void writeTag(int i10, int i11);

    public abstract void writeUInt32(int i10, int i11);

    public abstract void writeUInt32NoTag(int i10);

    public abstract void writeUInt64(int i10, long j10);

    public abstract void writeUInt64NoTag(long j10);

    private CodedOutputStream() {
    }

    @Deprecated
    static int computeGroupSize(int i10, MessageLite messageLite, N n10) {
        return (computeTagSize(i10) * 2) + computeGroupSizeNoTag(messageLite, n10);
    }

    @Deprecated
    static int computeGroupSizeNoTag(MessageLite messageLite, N n10) {
        return ((AbstractMessageLite) messageLite).getSerializedSize(n10);
    }

    static int computeMessageSize(int i10, MessageLite messageLite, N n10) {
        return computeTagSize(i10) + computeMessageSizeNoTag(messageLite, n10);
    }

    static int computeMessageSizeNoTag(MessageLite messageLite, N n10) {
        return computeLengthDelimitedFieldSize(((AbstractMessageLite) messageLite).getSerializedSize(n10));
    }

    public static CodedOutputStream newInstance(OutputStream outputStream, int i10) {
        return new f(outputStream, i10);
    }

    @Deprecated
    final void writeGroupNoTag(MessageLite messageLite, N n10) {
        n10.h(messageLite, this.wrapper);
    }

    public final void writeRawByte(int i10) {
        write((byte) i10);
    }

    public final void writeRawBytes(byte[] bArr, int i10, int i11) {
        write(bArr, i10, i11);
    }

    public static CodedOutputStream newInstance(byte[] bArr) {
        return newInstance(bArr, 0, bArr.length);
    }

    public final void writeRawBytes(ByteString byteString) {
        byteString.writeTo(this);
    }

    public static CodedOutputStream newInstance(byte[] bArr, int i10, int i11) {
        return new c(bArr, i10, i11);
    }

    @Deprecated
    final void writeGroup(int i10, MessageLite messageLite, N n10) {
        writeTag(i10, 3);
        writeGroupNoTag(messageLite, n10);
        writeTag(i10, 4);
    }

    public static CodedOutputStream newInstance(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return new e(byteBuffer);
        }
        if (byteBuffer.isDirect() && !byteBuffer.isReadOnly()) {
            if (h.b()) {
                return newUnsafeInstance(byteBuffer);
            }
            return newSafeInstance(byteBuffer);
        }
        throw new IllegalArgumentException("ByteBuffer is read-only");
    }

    @Deprecated
    public static CodedOutputStream newInstance(ByteBuffer byteBuffer, int i10) {
        return newInstance(byteBuffer);
    }

    static CodedOutputStream newInstance(ByteOutput byteOutput, int i10) {
        if (i10 >= 0) {
            return new d(byteOutput, i10);
        }
        throw new IllegalArgumentException("bufferSize must be positive");
    }
}
