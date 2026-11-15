package p201u0;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f49763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f49764b;

    public h(List topics, List encryptedTopics) {
        Intrinsics.checkNotNullParameter(topics, "topics");
        Intrinsics.checkNotNullParameter(encryptedTopics, "encryptedTopics");
        this.f49763a = topics;
        this.f49764b = encryptedTopics;
    }

    public final List a() {
        return this.f49763a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f49763a.size() == hVar.f49763a.size() && this.f49764b.size() == hVar.f49764b.size() && Intrinsics.b(new HashSet(this.f49763a), new HashSet(hVar.f49763a)) && Intrinsics.b(new HashSet(this.f49764b), new HashSet(hVar.f49764b));
    }

    public int hashCode() {
        return Objects.hash(this.f49763a, this.f49764b);
    }

    public String toString() {
        return "GetTopicsResponse: Topics=" + this.f49763a + ", EncryptedTopics=" + this.f49764b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(List topics) {
        this(topics, CollectionsKt.i());
        Intrinsics.checkNotNullParameter(topics, "topics");
    }
}
