package H4;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.C2505Uk;
import com.google.android.gms.internal.ads.C2557Vk;
import com.google.android.gms.internal.ads.C4537nq;
import com.google.android.gms.internal.ads.C4667os;
import java.util.Random;

/* JADX INFO: renamed from: H4.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0654z {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final C0654z f1468g = new C0654z();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f1469h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final L4.g f1470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C0645w f1471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f1472c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final L4.a f1473d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Random f1474e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f1475f;

    protected C0654z() {
        L4.g gVar = new L4.g();
        C0645w c0645w = new C0645w(new f2(), new d2(), new G1(), new C2505Uk(), new C4667os(), new C4537nq(), new C2557Vk(), new g2());
        L4.a aVar = new L4.a(0, ModuleDescriptor.MODULE_VERSION, true);
        Random random = new Random();
        String strR = L4.g.r();
        this.f1470a = gVar;
        this.f1471b = c0645w;
        this.f1472c = false;
        this.f1473d = aVar;
        this.f1474e = random;
        this.f1475f = strR;
    }

    public static L4.g a() {
        return f1468g.f1470a;
    }

    public static C0645w b() {
        return f1468g.f1471b;
    }

    public static void c() {
        f1468g.f1472c = false;
    }

    public static void d() {
        f1468g.f1472c = true;
    }

    public static boolean e() {
        return f1468g.f1472c;
    }

    public static String f() {
        return f1468g.f1475f;
    }

    public static L4.a g() {
        return f1468g.f1473d;
    }

    public static Random h() {
        return f1468g.f1474e;
    }
}
