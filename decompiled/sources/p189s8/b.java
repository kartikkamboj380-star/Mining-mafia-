package p189s8;

import java.io.Serializable;
import kotlin.collections.AbstractC7018d;
import kotlin.collections.AbstractC7024j;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
final class b extends AbstractC7018d implements EnumEntries, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Enum[] f49358b;

    public b(Enum[] entries) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        this.f49358b = entries;
    }

    @Override // kotlin.collections.AbstractC7016b
    public int b() {
        return this.f49358b.length;
    }

    @Override // kotlin.collections.AbstractC7016b, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Enum) {
            return g((Enum) obj);
        }
        return false;
    }

    public boolean g(Enum element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return ((Enum) AbstractC7024j.D(this.f49358b, element.ordinal())) == element;
    }

    @Override // kotlin.collections.AbstractC7018d, java.util.List
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Enum get(int i10) {
        AbstractC7018d.f45933a.b(i10, this.f49358b.length);
        return this.f49358b[i10];
    }

    @Override // kotlin.collections.AbstractC7018d, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Enum) {
            return j((Enum) obj);
        }
        return -1;
    }

    public int j(Enum element) {
        Intrinsics.checkNotNullParameter(element, "element");
        int iOrdinal = element.ordinal();
        if (((Enum) AbstractC7024j.D(this.f49358b, iOrdinal)) == element) {
            return iOrdinal;
        }
        return -1;
    }

    public int k(Enum element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return indexOf(element);
    }

    @Override // kotlin.collections.AbstractC7018d, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Enum) {
            return k((Enum) obj);
        }
        return -1;
    }
}
