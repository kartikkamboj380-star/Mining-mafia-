package com.google.gson;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class s {

    private final class b extends s {
        private b() {
        }

        @Override // com.google.gson.s
        public Object b(p138n7.a aVar) throws IOException {
            if (aVar.n1() != p138n7.b.NULL) {
                return s.this.b(aVar);
            }
            aVar.V0();
            return null;
        }

        @Override // com.google.gson.s
        public void d(p138n7.c cVar, Object obj) throws IOException {
            if (obj == null) {
                cVar.S();
            } else {
                s.this.d(cVar, obj);
            }
        }

        public String toString() {
            return "NullSafeTypeAdapter[" + s.this + "]";
        }
    }

    public final s a() {
        return !(this instanceof b) ? new b() : this;
    }

    public abstract Object b(p138n7.a aVar);

    public final g c(Object obj) {
        try {
            com.google.gson.internal.bind.g gVar = new com.google.gson.internal.bind.g();
            d(gVar, obj);
            return gVar.s1();
        } catch (IOException e10) {
            throw new h(e10);
        }
    }

    public abstract void d(p138n7.c cVar, Object obj);
}
