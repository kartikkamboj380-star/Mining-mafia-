package com.google.protobuf;

import java.nio.Buffer;

/* JADX INFO: renamed from: com.google.protobuf.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC6759q {
    static void a(Buffer buffer) {
        buffer.clear();
    }

    static void b(Buffer buffer, int i10) {
        buffer.limit(i10);
    }

    static void c(Buffer buffer) {
        buffer.mark();
    }

    static void d(Buffer buffer, int i10) {
        buffer.position(i10);
    }

    static void e(Buffer buffer) {
        buffer.reset();
    }
}
