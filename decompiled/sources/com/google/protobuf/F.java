package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.InvalidMarkException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class F extends ByteString.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ByteBuffer f41065a;

    F(ByteBuffer byteBuffer) {
        Internal.checkNotNull(byteBuffer, "buffer");
        this.f41065a = byteBuffer.slice().order(ByteOrder.nativeOrder());
    }

    private ByteBuffer d(int i10, int i11) {
        if (i10 < this.f41065a.position() || i11 > this.f41065a.limit() || i10 > i11) {
            throw new IllegalArgumentException(String.format("Invalid indices [%d, %d]", Integer.valueOf(i10), Integer.valueOf(i11)));
        }
        ByteBuffer byteBufferSlice = this.f41065a.slice();
        AbstractC6759q.d(byteBufferSlice, i10 - this.f41065a.position());
        AbstractC6759q.b(byteBufferSlice, i11 - this.f41065a.position());
        return byteBufferSlice;
    }

    @Override // com.google.protobuf.ByteString.h
    boolean a(ByteString byteString, int i10, int i11) {
        return substring(0, i11).equals(byteString.substring(i10, i11 + i10));
    }

    @Override // com.google.protobuf.ByteString
    public ByteBuffer asReadOnlyByteBuffer() {
        return this.f41065a.asReadOnlyBuffer();
    }

    @Override // com.google.protobuf.ByteString
    public List asReadOnlyByteBufferList() {
        return Collections.singletonList(asReadOnlyByteBuffer());
    }

    @Override // com.google.protobuf.ByteString
    public byte byteAt(int i10) {
        try {
            return this.f41065a.get(i10);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw e10;
        } catch (IndexOutOfBoundsException e11) {
            throw new ArrayIndexOutOfBoundsException(e11.getMessage());
        }
    }

    @Override // com.google.protobuf.ByteString
    public void copyTo(ByteBuffer byteBuffer) {
        byteBuffer.put(this.f41065a.slice());
    }

    @Override // com.google.protobuf.ByteString
    protected void copyToInternal(byte[] bArr, int i10, int i11, int i12) {
        ByteBuffer byteBufferSlice = this.f41065a.slice();
        AbstractC6759q.d(byteBufferSlice, i10);
        byteBufferSlice.get(bArr, i11, i12);
    }

    @Override // com.google.protobuf.ByteString
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ByteString)) {
            return false;
        }
        ByteString byteString = (ByteString) obj;
        if (size() != byteString.size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof F) {
            return this.f41065a.equals(((F) obj).f41065a);
        }
        return obj instanceof M ? obj.equals(this) : this.f41065a.equals(byteString.asReadOnlyByteBuffer());
    }

    @Override // com.google.protobuf.ByteString
    public byte internalByteAt(int i10) {
        return byteAt(i10);
    }

    @Override // com.google.protobuf.ByteString
    public boolean isValidUtf8() {
        return W.s(this.f41065a);
    }

    @Override // com.google.protobuf.ByteString
    public CodedInputStream newCodedInput() {
        return CodedInputStream.newInstance(this.f41065a, true);
    }

    @Override // com.google.protobuf.ByteString
    public InputStream newInput() {
        return new a();
    }

    @Override // com.google.protobuf.ByteString
    protected int partialHash(int i10, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + this.f41065a.get(i13);
        }
        return i10;
    }

    @Override // com.google.protobuf.ByteString
    protected int partialIsValidUtf8(int i10, int i11, int i12) {
        return W.v(i10, this.f41065a, i11, i12 + i11);
    }

    @Override // com.google.protobuf.ByteString
    public int size() {
        return this.f41065a.remaining();
    }

    @Override // com.google.protobuf.ByteString
    public ByteString substring(int i10, int i11) {
        try {
            return new F(d(i10, i11));
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw e10;
        } catch (IndexOutOfBoundsException e11) {
            throw new ArrayIndexOutOfBoundsException(e11.getMessage());
        }
    }

    @Override // com.google.protobuf.ByteString
    protected String toStringInternal(Charset charset) {
        byte[] byteArray;
        int length;
        int iArrayOffset;
        if (this.f41065a.hasArray()) {
            byteArray = this.f41065a.array();
            iArrayOffset = this.f41065a.arrayOffset() + this.f41065a.position();
            length = this.f41065a.remaining();
        } else {
            byteArray = toByteArray();
            length = byteArray.length;
            iArrayOffset = 0;
        }
        return new String(byteArray, iArrayOffset, length, charset);
    }

    @Override // com.google.protobuf.ByteString
    public void writeTo(OutputStream outputStream) throws IOException {
        outputStream.write(toByteArray());
    }

    @Override // com.google.protobuf.ByteString
    void writeToInternal(OutputStream outputStream, int i10, int i11) throws IOException {
        if (!this.f41065a.hasArray()) {
            AbstractC6747e.g(d(i10, i11 + i10), outputStream);
        } else {
            outputStream.write(this.f41065a.array(), this.f41065a.arrayOffset() + this.f41065a.position() + i10, i11);
        }
    }

    class a extends InputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ByteBuffer f41066a;

        a() {
            this.f41066a = F.this.f41065a.slice();
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f41066a.remaining();
        }

        @Override // java.io.InputStream
        public void mark(int i10) {
            AbstractC6759q.c(this.f41066a);
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read() {
            if (this.f41066a.hasRemaining()) {
                return this.f41066a.get() & 255;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public void reset() throws IOException {
            try {
                AbstractC6759q.e(this.f41066a);
            } catch (InvalidMarkException e10) {
                throw new IOException(e10);
            }
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) {
            if (!this.f41066a.hasRemaining()) {
                return -1;
            }
            int iMin = Math.min(i11, this.f41066a.remaining());
            this.f41066a.get(bArr, i10, iMin);
            return iMin;
        }
    }

    @Override // com.google.protobuf.ByteString
    void writeTo(ByteOutput byteOutput) {
        byteOutput.writeLazy(this.f41065a.slice());
    }
}
