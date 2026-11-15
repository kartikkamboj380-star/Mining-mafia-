package com.google.common.util.concurrent;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public abstract class h extends g implements p {

    public static abstract class a extends h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final p f39936a;

        protected a(p pVar) {
            this.f39936a = (p) X5.j.h(pVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.util.concurrent.g
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public final p d() {
            return this.f39936a;
        }
    }

    protected h() {
    }

    @Override // com.google.common.util.concurrent.p
    public void e(Runnable runnable, Executor executor) {
        c().e(runnable, executor);
    }

    /* JADX INFO: renamed from: f */
    protected abstract p c();
}
