package Y8;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.protobuf.CodedOutputStream;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f7055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f7056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f7057c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f7058d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f7059e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f7060f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f7061g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f7062h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f7063i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f7064j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f7065k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f7066l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f7067m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f7068n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f7069o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private a f7070p;

    public d(boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, String prettyPrintIndent, boolean z15, boolean z16, String classDiscriminator, boolean z17, boolean z18, g gVar, boolean z19, boolean z20, boolean z21, a classDiscriminatorMode) {
        Intrinsics.checkNotNullParameter(prettyPrintIndent, "prettyPrintIndent");
        Intrinsics.checkNotNullParameter(classDiscriminator, "classDiscriminator");
        Intrinsics.checkNotNullParameter(classDiscriminatorMode, "classDiscriminatorMode");
        this.f7055a = z9;
        this.f7056b = z10;
        this.f7057c = z11;
        this.f7058d = z12;
        this.f7059e = z13;
        this.f7060f = z14;
        this.f7061g = prettyPrintIndent;
        this.f7062h = z15;
        this.f7063i = z16;
        this.f7064j = classDiscriminator;
        this.f7065k = z17;
        this.f7066l = z18;
        this.f7067m = z19;
        this.f7068n = z20;
        this.f7069o = z21;
        this.f7070p = classDiscriminatorMode;
    }

    public final boolean a() {
        return this.f7069o;
    }

    public final boolean b() {
        return this.f7065k;
    }

    public final boolean c() {
        return this.f7058d;
    }

    public final boolean d() {
        return this.f7068n;
    }

    public final String e() {
        return this.f7064j;
    }

    public final a f() {
        return this.f7070p;
    }

    public final boolean g() {
        return this.f7062h;
    }

    public final boolean h() {
        return this.f7067m;
    }

    public final boolean i() {
        return this.f7055a;
    }

    public final boolean j() {
        return this.f7060f;
    }

    public final boolean k() {
        return this.f7056b;
    }

    public final g l() {
        return null;
    }

    public final boolean m() {
        return this.f7059e;
    }

    public final String n() {
        return this.f7061g;
    }

    public final boolean o() {
        return this.f7066l;
    }

    public final boolean p() {
        return this.f7063i;
    }

    public final boolean q() {
        return this.f7057c;
    }

    public String toString() {
        return "JsonConfiguration(encodeDefaults=" + this.f7055a + ", ignoreUnknownKeys=" + this.f7056b + ", isLenient=" + this.f7057c + ", allowStructuredMapKeys=" + this.f7058d + ", prettyPrint=" + this.f7059e + ", explicitNulls=" + this.f7060f + ", prettyPrintIndent='" + this.f7061g + "', coerceInputValues=" + this.f7062h + ", useArrayPolymorphism=" + this.f7063i + ", classDiscriminator='" + this.f7064j + "', allowSpecialFloatingPointValues=" + this.f7065k + ", useAlternativeNames=" + this.f7066l + ", namingStrategy=" + ((Object) null) + ", decodeEnumsCaseInsensitive=" + this.f7067m + ", allowTrailingComma=" + this.f7068n + ", allowComments=" + this.f7069o + ", classDiscriminatorMode=" + this.f7070p + ')';
    }

    public /* synthetic */ d(boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, String str, boolean z15, boolean z16, String str2, boolean z17, boolean z18, g gVar, boolean z19, boolean z20, boolean z21, a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z9, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? false : z11, (i10 & 8) != 0 ? false : z12, (i10 & 16) != 0 ? false : z13, (i10 & 32) != 0 ? true : z14, (i10 & 64) != 0 ? "    " : str, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? false : z15, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? false : z16, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? HandleInvocationsFromAdViewer.KEY_AD_TYPE : str2, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? false : z17, (i10 & 2048) == 0 ? z18 : true, (i10 & CodedOutputStream.DEFAULT_BUFFER_SIZE) != 0 ? null : gVar, (i10 & 8192) != 0 ? false : z19, (i10 & 16384) != 0 ? false : z20, (i10 & 32768) != 0 ? false : z21, (i10 & 65536) != 0 ? a.POLYMORPHIC : aVar);
    }
}
