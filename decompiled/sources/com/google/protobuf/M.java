package com.google.protobuf;

import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
final class M extends ByteString {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final int[] f41131f = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, com.google.android.gms.common.api.Api.BaseClientBuilder.API_PRIORITY_OTHER};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f41132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ByteString f41133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ByteString f41134c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f41135d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f41136e;

    class a extends ByteString.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final c f41137a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ByteString.ByteIterator f41138b = b();

        a() {
            this.f41137a = new c(M.this, null);
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [com.google.protobuf.ByteString$ByteIterator] */
        private ByteString.ByteIterator b() {
            if (this.f41137a.hasNext()) {
                return this.f41137a.next().iterator2();
            }
            return null;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f41138b != null;
        }

        @Override // com.google.protobuf.ByteString.ByteIterator
        public byte nextByte() {
            ByteString.ByteIterator byteIterator = this.f41138b;
            if (byteIterator == null) {
                throw new NoSuchElementException();
            }
            byte bNextByte = byteIterator.nextByte();
            if (!this.f41138b.hasNext()) {
                this.f41138b = b();
            }
            return bNextByte;
        }
    }

    private static final class c implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ArrayDeque f41141a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ByteString.h f41142b;

        /* synthetic */ c(ByteString byteString, a aVar) {
            this(byteString);
        }

        private ByteString.h a(ByteString byteString) {
            while (byteString instanceof M) {
                M m10 = (M) byteString;
                this.f41141a.push(m10);
                byteString = m10.f41133b;
            }
            return (ByteString.h) byteString;
        }

        private ByteString.h b() {
            ByteString.h hVarA;
            do {
                ArrayDeque arrayDeque = this.f41141a;
                if (arrayDeque == null || arrayDeque.isEmpty()) {
                    return null;
                }
                hVarA = a(((M) this.f41141a.pop()).f41134c);
            } while (hVarA.isEmpty());
            return hVarA;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public ByteString.h next() {
            ByteString.h hVar = this.f41142b;
            if (hVar == null) {
                throw new NoSuchElementException();
            }
            this.f41142b = b();
            return hVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f41142b != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private c(ByteString byteString) {
            if (!(byteString instanceof M)) {
                this.f41141a = null;
                this.f41142b = (ByteString.h) byteString;
                return;
            }
            M m10 = (M) byteString;
            ArrayDeque arrayDeque = new ArrayDeque(m10.getTreeDepth());
            this.f41141a = arrayDeque;
            arrayDeque.push(m10);
            this.f41142b = a(m10.f41133b);
        }
    }

    /* synthetic */ M(ByteString byteString, ByteString byteString2, a aVar) {
        this(byteString, byteString2);
    }

    static ByteString d(ByteString byteString, ByteString byteString2) {
        if (byteString2.size() == 0) {
            return byteString;
        }
        if (byteString.size() == 0) {
            return byteString2;
        }
        int size = byteString.size() + byteString2.size();
        if (size < 128) {
            return e(byteString, byteString2);
        }
        if (byteString instanceof M) {
            M m10 = (M) byteString;
            if (m10.f41134c.size() + byteString2.size() < 128) {
                return new M(m10.f41133b, e(m10.f41134c, byteString2));
            }
            if (m10.f41133b.getTreeDepth() > m10.f41134c.getTreeDepth() && m10.getTreeDepth() > byteString2.getTreeDepth()) {
                return new M(m10.f41133b, new M(m10.f41134c, byteString2));
            }
        }
        return size >= i(Math.max(byteString.getTreeDepth(), byteString2.getTreeDepth()) + 1) ? new M(byteString, byteString2) : new b(null).b(byteString, byteString2);
    }

    private static ByteString e(ByteString byteString, ByteString byteString2) {
        int size = byteString.size();
        int size2 = byteString2.size();
        byte[] bArr = new byte[size + size2];
        byteString.copyTo(bArr, 0, 0, size);
        byteString2.copyTo(bArr, 0, size, size2);
        return ByteString.wrap(bArr);
    }

    private boolean g(ByteString byteString) {
        ByteString.h hVar;
        a aVar = null;
        c cVar = new c(this, aVar);
        ByteString.h hVar2 = (ByteString.h) cVar.next();
        c cVar2 = new c(byteString, aVar);
        ByteString.h hVar3 = (ByteString.h) cVar2.next();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int size = hVar2.size() - i10;
            int size2 = hVar3.size() - i11;
            int iMin = Math.min(size, size2);
            if (!(i10 == 0 ? hVar2.a(hVar3, i11, iMin) : hVar3.a(hVar2, i10, iMin))) {
                return false;
            }
            i12 += iMin;
            int i13 = this.f41132a;
            if (i12 >= i13) {
                if (i12 == i13) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (iMin == size) {
                hVar = (ByteString.h) cVar.next();
                i10 = 0;
            } else {
                i10 += iMin;
            }
            if (iMin == size2) {
                hVar2 = hVar2;
                hVar2 = hVar;
                hVar3 = (ByteString.h) cVar2.next();
                i11 = 0;
            } else {
                hVar2 = hVar2;
                hVar2 = hVar;
                i11 += iMin;
            }
        }
    }

    static int i(int i10) {
        int[] iArr = f41131f;
        return i10 >= iArr.length ? com.google.android.gms.common.api.Api.BaseClientBuilder.API_PRIORITY_OTHER : iArr[i10];
    }

    @Override // com.google.protobuf.ByteString
    public ByteBuffer asReadOnlyByteBuffer() {
        return ByteBuffer.wrap(toByteArray()).asReadOnlyBuffer();
    }

    @Override // com.google.protobuf.ByteString
    public List asReadOnlyByteBufferList() {
        ArrayList arrayList = new ArrayList();
        c cVar = new c(this, null);
        while (cVar.hasNext()) {
            arrayList.add(cVar.next().asReadOnlyByteBuffer());
        }
        return arrayList;
    }

    @Override // com.google.protobuf.ByteString
    public byte byteAt(int i10) {
        ByteString.checkIndex(i10, this.f41132a);
        return internalByteAt(i10);
    }

    @Override // com.google.protobuf.ByteString
    public void copyTo(ByteBuffer byteBuffer) {
        this.f41133b.copyTo(byteBuffer);
        this.f41134c.copyTo(byteBuffer);
    }

    @Override // com.google.protobuf.ByteString
    protected void copyToInternal(byte[] bArr, int i10, int i11, int i12) {
        int i13 = i10 + i12;
        int i14 = this.f41135d;
        if (i13 <= i14) {
            this.f41133b.copyToInternal(bArr, i10, i11, i12);
        } else {
            if (i10 >= i14) {
                this.f41134c.copyToInternal(bArr, i10 - i14, i11, i12);
                return;
            }
            int i15 = i14 - i10;
            this.f41133b.copyToInternal(bArr, i10, i11, i15);
            this.f41134c.copyToInternal(bArr, 0, i11 + i15, i12 - i15);
        }
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
        if (this.f41132a != byteString.size()) {
            return false;
        }
        if (this.f41132a == 0) {
            return true;
        }
        int iPeekCachedHashCode = peekCachedHashCode();
        int iPeekCachedHashCode2 = byteString.peekCachedHashCode();
        if (iPeekCachedHashCode == 0 || iPeekCachedHashCode2 == 0 || iPeekCachedHashCode == iPeekCachedHashCode2) {
            return g(byteString);
        }
        return false;
    }

    @Override // com.google.protobuf.ByteString
    protected int getTreeDepth() {
        return this.f41136e;
    }

    @Override // com.google.protobuf.ByteString
    byte internalByteAt(int i10) {
        int i11 = this.f41135d;
        return i10 < i11 ? this.f41133b.internalByteAt(i10) : this.f41134c.internalByteAt(i10 - i11);
    }

    @Override // com.google.protobuf.ByteString
    protected boolean isBalanced() {
        return this.f41132a >= i(this.f41136e);
    }

    @Override // com.google.protobuf.ByteString
    public boolean isValidUtf8() {
        int iPartialIsValidUtf8 = this.f41133b.partialIsValidUtf8(0, 0, this.f41135d);
        ByteString byteString = this.f41134c;
        return byteString.partialIsValidUtf8(iPartialIsValidUtf8, 0, byteString.size()) == 0;
    }

    @Override // com.google.protobuf.ByteString
    public CodedInputStream newCodedInput() {
        return CodedInputStream.newInstance((Iterable<ByteBuffer>) asReadOnlyByteBufferList(), true);
    }

    @Override // com.google.protobuf.ByteString
    public InputStream newInput() {
        return new d();
    }

    @Override // com.google.protobuf.ByteString
    protected int partialHash(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        int i14 = this.f41135d;
        if (i13 <= i14) {
            return this.f41133b.partialHash(i10, i11, i12);
        }
        if (i11 >= i14) {
            return this.f41134c.partialHash(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return this.f41134c.partialHash(this.f41133b.partialHash(i10, i11, i15), 0, i12 - i15);
    }

    @Override // com.google.protobuf.ByteString
    protected int partialIsValidUtf8(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        int i14 = this.f41135d;
        if (i13 <= i14) {
            return this.f41133b.partialIsValidUtf8(i10, i11, i12);
        }
        if (i11 >= i14) {
            return this.f41134c.partialIsValidUtf8(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return this.f41134c.partialIsValidUtf8(this.f41133b.partialIsValidUtf8(i10, i11, i15), 0, i12 - i15);
    }

    @Override // com.google.protobuf.ByteString
    public int size() {
        return this.f41132a;
    }

    @Override // com.google.protobuf.ByteString
    public ByteString substring(int i10, int i11) {
        int iCheckRange = ByteString.checkRange(i10, i11, this.f41132a);
        if (iCheckRange == 0) {
            return ByteString.EMPTY;
        }
        if (iCheckRange == this.f41132a) {
            return this;
        }
        int i12 = this.f41135d;
        if (i11 <= i12) {
            return this.f41133b.substring(i10, i11);
        }
        return i10 >= i12 ? this.f41134c.substring(i10 - i12, i11 - i12) : new M(this.f41133b.substring(i10), this.f41134c.substring(0, i11 - this.f41135d));
    }

    @Override // com.google.protobuf.ByteString
    protected String toStringInternal(Charset charset) {
        return new String(toByteArray(), charset);
    }

    @Override // com.google.protobuf.ByteString
    public void writeTo(OutputStream outputStream) {
        this.f41133b.writeTo(outputStream);
        this.f41134c.writeTo(outputStream);
    }

    @Override // com.google.protobuf.ByteString
    void writeToInternal(OutputStream outputStream, int i10, int i11) {
        int i12 = i10 + i11;
        int i13 = this.f41135d;
        if (i12 <= i13) {
            this.f41133b.writeToInternal(outputStream, i10, i11);
        } else {
            if (i10 >= i13) {
                this.f41134c.writeToInternal(outputStream, i10 - i13, i11);
                return;
            }
            int i14 = i13 - i10;
            this.f41133b.writeToInternal(outputStream, i10, i14);
            this.f41134c.writeToInternal(outputStream, 0, i11 - i14);
        }
    }

    @Override // com.google.protobuf.ByteString
    void writeToReverse(ByteOutput byteOutput) {
        this.f41134c.writeToReverse(byteOutput);
        this.f41133b.writeToReverse(byteOutput);
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ArrayDeque f41140a;

        private b() {
            this.f41140a = new ArrayDeque();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public ByteString b(ByteString byteString, ByteString byteString2) {
            c(byteString);
            c(byteString2);
            ByteString m10 = (ByteString) this.f41140a.pop();
            while (!this.f41140a.isEmpty()) {
                m10 = new M((ByteString) this.f41140a.pop(), m10, null);
            }
            return m10;
        }

        private void c(ByteString byteString) {
            if (byteString.isBalanced()) {
                e(byteString);
                return;
            }
            if (byteString instanceof M) {
                M m10 = (M) byteString;
                c(m10.f41133b);
                c(m10.f41134c);
            } else {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found " + byteString.getClass());
            }
        }

        private int d(int i10) {
            int iBinarySearch = Arrays.binarySearch(M.f41131f, i10);
            return iBinarySearch < 0 ? (-(iBinarySearch + 1)) - 1 : iBinarySearch;
        }

        private void e(ByteString byteString) {
            a aVar;
            int iD = d(byteString.size());
            int i10 = M.i(iD + 1);
            if (this.f41140a.isEmpty() || ((ByteString) this.f41140a.peek()).size() >= i10) {
                this.f41140a.push(byteString);
                return;
            }
            int i11 = M.i(iD);
            ByteString m10 = (ByteString) this.f41140a.pop();
            while (true) {
                aVar = null;
                if (this.f41140a.isEmpty() || ((ByteString) this.f41140a.peek()).size() >= i11) {
                    break;
                } else {
                    m10 = new M((ByteString) this.f41140a.pop(), m10, aVar);
                }
            }
            M m11 = new M(m10, byteString, aVar);
            while (!this.f41140a.isEmpty()) {
                if (((ByteString) this.f41140a.peek()).size() >= M.i(d(m11.size()) + 1)) {
                    break;
                } else {
                    m11 = new M((ByteString) this.f41140a.pop(), m11, aVar);
                }
            }
            this.f41140a.push(m11);
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    private M(ByteString byteString, ByteString byteString2) {
        this.f41133b = byteString;
        this.f41134c = byteString2;
        int size = byteString.size();
        this.f41135d = size;
        this.f41132a = size + byteString2.size();
        this.f41136e = Math.max(byteString.getTreeDepth(), byteString2.getTreeDepth()) + 1;
    }

    @Override // com.google.protobuf.ByteString, java.lang.Iterable
    /* JADX INFO: renamed from: iterator */
    public Iterator<Byte> iterator2() {
        return new a();
    }

    @Override // com.google.protobuf.ByteString
    void writeTo(ByteOutput byteOutput) {
        this.f41133b.writeTo(byteOutput);
        this.f41134c.writeTo(byteOutput);
    }

    private class d extends InputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private c f41143a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ByteString.h f41144b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f41145c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f41146d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f41147e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f41148f;

        public d() {
            h();
        }

        private void a() {
            if (this.f41144b != null) {
                int i10 = this.f41146d;
                int i11 = this.f41145c;
                if (i10 == i11) {
                    this.f41147e += i11;
                    this.f41146d = 0;
                    if (!this.f41143a.hasNext()) {
                        this.f41144b = null;
                        this.f41145c = 0;
                    } else {
                        ByteString.h next = this.f41143a.next();
                        this.f41144b = next;
                        this.f41145c = next.size();
                    }
                }
            }
        }

        private int c() {
            return M.this.size() - (this.f41147e + this.f41146d);
        }

        private void h() {
            c cVar = new c(M.this, null);
            this.f41143a = cVar;
            ByteString.h next = cVar.next();
            this.f41144b = next;
            this.f41145c = next.size();
            this.f41146d = 0;
            this.f41147e = 0;
        }

        private int j(byte[] bArr, int i10, int i11) {
            int i12 = i11;
            while (i12 > 0) {
                a();
                if (this.f41144b == null) {
                    break;
                }
                int iMin = Math.min(this.f41145c - this.f41146d, i12);
                if (bArr != null) {
                    this.f41144b.copyTo(bArr, this.f41146d, i10, iMin);
                    i10 += iMin;
                }
                this.f41146d += iMin;
                i12 -= iMin;
            }
            return i11 - i12;
        }

        @Override // java.io.InputStream
        public int available() {
            return c();
        }

        @Override // java.io.InputStream
        public void mark(int i10) {
            this.f41148f = this.f41147e + this.f41146d;
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) {
            bArr.getClass();
            if (i10 < 0 || i11 < 0 || i11 > bArr.length - i10) {
                throw new IndexOutOfBoundsException();
            }
            int iJ = j(bArr, i10, i11);
            if (iJ != 0) {
                return iJ;
            }
            if (i11 > 0 || c() == 0) {
                return -1;
            }
            return iJ;
        }

        @Override // java.io.InputStream
        public synchronized void reset() {
            h();
            j(null, 0, this.f41148f);
        }

        @Override // java.io.InputStream
        public long skip(long j10) {
            if (j10 < 0) {
                throw new IndexOutOfBoundsException();
            }
            if (j10 > 2147483647L) {
                j10 = 2147483647L;
            }
            return j(null, 0, (int) j10);
        }

        @Override // java.io.InputStream
        public int read() {
            a();
            ByteString.h hVar = this.f41144b;
            if (hVar == null) {
                return -1;
            }
            int i10 = this.f41146d;
            this.f41146d = i10 + 1;
            return hVar.byteAt(i10) & 255;
        }
    }
}
