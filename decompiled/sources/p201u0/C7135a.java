package p201u0;

import java.util.Arrays;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: renamed from: u0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7135a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f49755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f49756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f49757c;

    public C7135a(byte[] encryptedTopic, String keyIdentifier, byte[] encapsulatedKey) {
        Intrinsics.checkNotNullParameter(encryptedTopic, "encryptedTopic");
        Intrinsics.checkNotNullParameter(keyIdentifier, "keyIdentifier");
        Intrinsics.checkNotNullParameter(encapsulatedKey, "encapsulatedKey");
        this.f49755a = encryptedTopic;
        this.f49756b = keyIdentifier;
        this.f49757c = encapsulatedKey;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7135a)) {
            return false;
        }
        C7135a c7135a = (C7135a) obj;
        return Arrays.equals(this.f49755a, c7135a.f49755a) && this.f49756b.contentEquals(c7135a.f49756b) && Arrays.equals(this.f49757c, c7135a.f49757c);
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(Arrays.hashCode(this.f49755a)), this.f49756b, Integer.valueOf(Arrays.hashCode(this.f49757c)));
    }

    public String toString() {
        return "EncryptedTopic { " + ("EncryptedTopic=" + StringsKt.s(this.f49755a) + ", KeyIdentifier=" + this.f49756b + ", EncapsulatedKey=" + StringsKt.s(this.f49757c) + " }");
    }
}
