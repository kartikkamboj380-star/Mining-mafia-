package com.google.android.gms.common.api.internal;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC1442x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zabf f17088a;

    protected AbstractC1442x(zabf zabfVar) {
        this.f17088a = zabfVar;
    }

    protected abstract void a();

    public final void b(zabi zabiVar) {
        zabiVar.zai.lock();
        try {
            if (zabiVar.zan == this.f17088a) {
                a();
            }
        } finally {
            zabiVar.zai.unlock();
        }
    }
}
