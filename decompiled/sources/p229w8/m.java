package p229w8;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes3.dex */
final class m implements Sequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BufferedReader f50418a;

    public static final class a implements Iterator, A8.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f50419a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f50420b;

        a() {
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            String str = this.f50419a;
            this.f50419a = null;
            Intrinsics.c(str);
            return str;
        }

        @Override // java.util.Iterator
        public boolean hasNext() throws IOException {
            if (this.f50419a == null && !this.f50420b) {
                String line = m.this.f50418a.readLine();
                this.f50419a = line;
                if (line == null) {
                    this.f50420b = true;
                }
            }
            return this.f50419a != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public m(BufferedReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        this.f50418a = reader;
    }

    @Override // kotlin.sequences.Sequence
    public Iterator iterator() {
        return new a();
    }
}
