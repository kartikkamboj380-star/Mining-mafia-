package kotlin.collections;

import java.util.AbstractCollection;
import java.util.Collection;

/* JADX INFO: renamed from: kotlin.collections.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7019e extends AbstractCollection implements Collection, A8.b {
    protected AbstractC7019e() {
    }

    public abstract int a();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final /* bridge */ int size() {
        return a();
    }
}
