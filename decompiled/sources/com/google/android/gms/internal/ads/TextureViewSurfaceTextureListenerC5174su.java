package com.google.android.gms.internal.ads;

import K4.AbstractC0786o0;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.su, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class TextureViewSurfaceTextureListenerC5174su extends AbstractC5426uu implements TextureView.SurfaceTextureListener, MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener {

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private static final Map f33247K;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private int f33248G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private InterfaceC5300tu f33249H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private boolean f33250I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private Integer f33251J;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC2265Pu f33252c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C2317Qu f33253d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f33254e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final QR f33255f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f33256g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f33257h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private MediaPlayer f33258i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Uri f33259j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f33260k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f33261l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f33262m;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private C2161Nu f33263v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final boolean f33264w;

    static {
        HashMap map = new HashMap();
        f33247K = map;
        map.put(-1004, "MEDIA_ERROR_IO");
        map.put(-1007, "MEDIA_ERROR_MALFORMED");
        map.put(-1010, "MEDIA_ERROR_UNSUPPORTED");
        map.put(-110, "MEDIA_ERROR_TIMED_OUT");
        map.put(3, "MEDIA_INFO_VIDEO_RENDERING_START");
        map.put(100, "MEDIA_ERROR_SERVER_DIED");
        map.put(1, "MEDIA_ERROR_UNKNOWN");
        map.put(1, "MEDIA_INFO_UNKNOWN");
        map.put(700, "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        map.put(701, "MEDIA_INFO_BUFFERING_START");
        map.put(702, "MEDIA_INFO_BUFFERING_END");
        map.put(800, "MEDIA_INFO_BAD_INTERLEAVING");
        map.put(801, "MEDIA_INFO_NOT_SEEKABLE");
        map.put(802, "MEDIA_INFO_METADATA_UPDATE");
        map.put(901, "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
        map.put(902, "MEDIA_INFO_SUBTITLE_TIMED_OUT");
    }

    public TextureViewSurfaceTextureListenerC5174su(Context context, InterfaceC2265Pu interfaceC2265Pu, boolean z9, boolean z10, C2213Ou c2213Ou, C2317Qu c2317Qu, QR qr) {
        super(context);
        this.f33256g = 0;
        this.f33257h = 0;
        this.f33250I = false;
        this.f33251J = null;
        this.f33252c = interfaceC2265Pu;
        this.f33253d = c2317Qu;
        this.f33264w = z9;
        this.f33254e = z10;
        c2317Qu.a(this);
        this.f33255f = qr;
    }

    private final void A() {
        QR qr;
        AbstractC0786o0.k("AdMediaPlayerView init MediaPlayer");
        SurfaceTexture surfaceTexture = getSurfaceTexture();
        if (this.f33259j == null || surfaceTexture == null) {
            return;
        }
        D(false);
        try {
            G4.t.z();
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.f33258i = mediaPlayer;
            mediaPlayer.setOnBufferingUpdateListener(this);
            this.f33258i.setOnCompletionListener(this);
            this.f33258i.setOnErrorListener(this);
            this.f33258i.setOnInfoListener(this);
            this.f33258i.setOnPreparedListener(this);
            this.f33258i.setOnVideoSizeChangedListener(this);
            this.f33262m = 0;
            if (this.f33264w) {
                if (((Boolean) H4.B.c().d(AbstractC3892ii.Le)).booleanValue() && (qr = this.f33255f) != null) {
                    PR prA = qr.a();
                    prA.c(HandleInvocationsFromAdViewer.KEY_ACTION, "svp_ampv");
                    prA.d();
                }
                C2161Nu c2161Nu = new C2161Nu(getContext());
                this.f33263v = c2161Nu;
                c2161Nu.a(surfaceTexture, getWidth(), getHeight());
                C2161Nu c2161Nu2 = this.f33263v;
                c2161Nu2.start();
                SurfaceTexture surfaceTextureD = c2161Nu2.d();
                if (surfaceTextureD != null) {
                    surfaceTexture = surfaceTextureD;
                } else {
                    this.f33263v.c();
                    this.f33263v = null;
                }
            }
            this.f33258i.setDataSource(getContext(), this.f33259j);
            G4.t.A();
            this.f33258i.setSurface(new Surface(surfaceTexture));
            this.f33258i.setAudioStreamType(3);
            this.f33258i.setScreenOnWhilePlaying(true);
            this.f33258i.prepareAsync();
            H(1);
        } catch (IOException e10) {
            e = e10;
            L4.p.g("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.f33259j)), e);
            onError(this.f33258i, 1, 0);
        } catch (IllegalArgumentException e11) {
            e = e11;
            L4.p.g("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.f33259j)), e);
            onError(this.f33258i, 1, 0);
        } catch (IllegalStateException e12) {
            e = e12;
            L4.p.g("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.f33259j)), e);
            onError(this.f33258i, 1, 0);
        }
    }

    private final void D(boolean z9) {
        AbstractC0786o0.k("AdMediaPlayerView release");
        C2161Nu c2161Nu = this.f33263v;
        if (c2161Nu != null) {
            c2161Nu.c();
            this.f33263v = null;
        }
        MediaPlayer mediaPlayer = this.f33258i;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.f33258i.release();
            this.f33258i = null;
            H(0);
            if (z9) {
                this.f33257h = 0;
            }
        }
    }

    private final boolean E() {
        int i10;
        return (this.f33258i == null || (i10 = this.f33256g) == -1 || i10 == 0 || i10 == 1) ? false : true;
    }

    private final void G(float f10) {
        MediaPlayer mediaPlayer = this.f33258i;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.setVolume(f10, f10);
            } catch (IllegalStateException unused) {
            }
        } else {
            int i10 = AbstractC0786o0.f2696b;
            L4.p.f("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
        }
    }

    private final void H(int i10) {
        if (i10 == 3) {
            this.f33253d.e();
            this.f33938b.d();
        } else if (this.f33256g == 3) {
            this.f33253d.f();
            this.f33938b.e();
        }
        this.f33256g = i10;
    }

    final /* synthetic */ void I(int i10) {
        InterfaceC5300tu interfaceC5300tu = this.f33249H;
        if (interfaceC5300tu != null) {
            interfaceC5300tu.onWindowVisibilityChanged(i10);
        }
    }

    final /* synthetic */ void J(MediaPlayer mediaPlayer) {
        MediaFormat format;
        if (!((Boolean) H4.B.c().d(AbstractC3892ii.f30004w2)).booleanValue() || this.f33252c == null || mediaPlayer == null) {
            return;
        }
        try {
            MediaPlayer.TrackInfo[] trackInfo = mediaPlayer.getTrackInfo();
            if (trackInfo != null) {
                HashMap map = new HashMap();
                for (MediaPlayer.TrackInfo trackInfo2 : trackInfo) {
                    if (trackInfo2 != null) {
                        int trackType = trackInfo2.getTrackType();
                        if (trackType == 1) {
                            MediaFormat format2 = trackInfo2.getFormat();
                            if (format2 != null) {
                                if (format2.containsKey("frame-rate")) {
                                    try {
                                        map.put("frameRate", String.valueOf(format2.getFloat("frame-rate")));
                                    } catch (ClassCastException unused) {
                                        map.put("frameRate", String.valueOf(format2.getInteger("frame-rate")));
                                    }
                                }
                                if (format2.containsKey("bitrate")) {
                                    Integer numValueOf = Integer.valueOf(format2.getInteger("bitrate"));
                                    this.f33251J = numValueOf;
                                    map.put("bitRate", String.valueOf(numValueOf));
                                }
                                if (format2.containsKey("width") && format2.containsKey("height")) {
                                    int integer = format2.getInteger("width");
                                    int integer2 = format2.getInteger("height");
                                    StringBuilder sb = new StringBuilder(String.valueOf(integer).length() + 1 + String.valueOf(integer2).length());
                                    sb.append(integer);
                                    sb.append("x");
                                    sb.append(integer2);
                                    map.put("resolution", sb.toString());
                                }
                                if (format2.containsKey("mime")) {
                                    map.put("videoMime", format2.getString("mime"));
                                }
                                if (Build.VERSION.SDK_INT >= 30 && format2.containsKey("codecs-string")) {
                                    map.put("videoCodec", format2.getString("codecs-string"));
                                }
                            }
                        } else if (trackType == 2 && (format = trackInfo2.getFormat()) != null) {
                            if (format.containsKey("mime")) {
                                map.put("audioMime", format.getString("mime"));
                            }
                            if (Build.VERSION.SDK_INT >= 30 && format.containsKey("codecs-string")) {
                                map.put("audioCodec", format.getString("codecs-string"));
                            }
                        }
                    }
                }
                if (map.isEmpty()) {
                    return;
                }
                this.f33252c.b("onMetadataEvent", map);
            }
        } catch (RuntimeException e10) {
            G4.t.l().j(e10, "AdMediaPlayerView.reportMetadata");
        }
    }

    final /* synthetic */ InterfaceC5300tu K() {
        return this.f33249H;
    }

    final /* synthetic */ boolean L() {
        return this.f33250I;
    }

    final /* synthetic */ void M(boolean z9) {
        this.f33250I = true;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5426uu, com.google.android.gms.internal.ads.InterfaceC2421Su
    public final void a() {
        G(this.f33938b.c());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5426uu
    public final String i() {
        return "MediaPlayer".concat(true != this.f33264w ? "" : " spherical");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5426uu
    public final void j(InterfaceC5300tu interfaceC5300tu) {
        this.f33249H = interfaceC5300tu;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5426uu
    public final void k(String str) {
        Uri uri = Uri.parse(str);
        C1924Jf c1924JfA = C1924Jf.a(uri);
        if (c1924JfA == null || c1924JfA.f19954a != null) {
            if (c1924JfA != null) {
                uri = Uri.parse(c1924JfA.f19954a);
            }
            this.f33259j = uri;
            this.f33248G = 0;
            A();
            requestLayout();
            invalidate();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5426uu
    public final void l() {
        AbstractC0786o0.k("AdMediaPlayerView stop");
        MediaPlayer mediaPlayer = this.f33258i;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.f33258i.release();
            this.f33258i = null;
            H(0);
            this.f33257h = 0;
        }
        this.f33253d.c();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5426uu
    public final void m() {
        AbstractC0786o0.k("AdMediaPlayerView play");
        if (E()) {
            this.f33258i.start();
            H(3);
            this.f33937a.a();
            K4.F0.f2598l.post(new RunnableC4671ou(this));
        }
        this.f33257h = 3;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5426uu
    public final void n() {
        AbstractC0786o0.k("AdMediaPlayerView pause");
        if (E() && this.f33258i.isPlaying()) {
            this.f33258i.pause();
            H(4);
            K4.F0.f2598l.post(new RunnableC4797pu(this));
        }
        this.f33257h = 4;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5426uu
    public final int o() {
        if (E()) {
            return this.f33258i.getDuration();
        }
        return -1;
    }

    @Override // android.view.TextureView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setSurfaceTextureListener(this);
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i10) {
        this.f33262m = i10;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        AbstractC0786o0.k("AdMediaPlayerView completion");
        H(5);
        this.f33257h = 5;
        K4.F0.f2598l.post(new RunnableC4041ju(this));
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
        Map map = f33247K;
        String str = (String) map.get(Integer.valueOf(i10));
        String str2 = (String) map.get(Integer.valueOf(i11));
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 38 + String.valueOf(str2).length());
        sb.append("AdMediaPlayerView MediaPlayer error: ");
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        String string = sb.toString();
        int i12 = AbstractC0786o0.f2696b;
        L4.p.f(string);
        H(-1);
        this.f33257h = -1;
        K4.F0.f2598l.post(new RunnableC4167ku(this, str, str2));
        return true;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i10, int i11) {
        Map map = f33247K;
        String str = (String) map.get(Integer.valueOf(i10));
        String str2 = (String) map.get(Integer.valueOf(i11));
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 37 + String.valueOf(str2).length());
        sb.append("AdMediaPlayerView MediaPlayer info: ");
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        AbstractC0786o0.k(sb.toString());
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0047  */
    /* JADX WARN: Code duplicated, block: B:26:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x0064  */
    /* JADX WARN: Code duplicated, block: B:36:0x0070  */
    @Override // android.view.View
    protected final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int defaultSize = View.getDefaultSize(this.f33260k, i10);
        int defaultSize2 = View.getDefaultSize(this.f33261l, i11);
        if (this.f33260k > 0 && this.f33261l > 0 && this.f33263v == null) {
            int mode = View.MeasureSpec.getMode(i10);
            int size = View.MeasureSpec.getSize(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            int size2 = View.MeasureSpec.getSize(i11);
            if (mode != 1073741824) {
                if (mode == 1073741824) {
                    i15 = (this.f33261l * size) / this.f33260k;
                    if (mode2 == Integer.MIN_VALUE || i15 <= size2) {
                        defaultSize2 = i15;
                        defaultSize = size;
                    }
                    defaultSize = size;
                    defaultSize2 = size2;
                } else {
                    if (mode2 == 1073741824) {
                        i14 = (this.f33260k * size2) / this.f33261l;
                        if (mode != Integer.MIN_VALUE && i14 > size) {
                            defaultSize = size;
                        }
                        defaultSize2 = size2;
                    } else {
                        i12 = this.f33260k;
                        i13 = this.f33261l;
                        if (mode2 == Integer.MIN_VALUE || i13 <= size2) {
                            i14 = i12;
                            size2 = i13;
                        } else {
                            i14 = (size2 * i12) / i13;
                        }
                        if (mode == Integer.MIN_VALUE && i14 > size) {
                            defaultSize2 = (i13 * size) / i12;
                            defaultSize = size;
                        }
                    }
                    defaultSize = i14;
                    defaultSize2 = size2;
                }
            } else if (mode2 == 1073741824) {
                int i16 = this.f33260k;
                int i17 = i16 * size2;
                int i18 = this.f33261l;
                int i19 = size * i18;
                if (i17 < i19) {
                    defaultSize = i17 / i18;
                } else {
                    if (i17 > i19) {
                        defaultSize2 = i19 / i16;
                        defaultSize = size;
                    }
                    defaultSize = size;
                }
                defaultSize2 = size2;
            } else {
                mode = 1073741824;
                if (mode == 1073741824) {
                    i15 = (this.f33261l * size) / this.f33260k;
                    if (mode2 == Integer.MIN_VALUE) {
                    }
                    defaultSize2 = i15;
                    defaultSize = size;
                } else {
                    if (mode2 == 1073741824) {
                        i14 = (this.f33260k * size2) / this.f33261l;
                        if (mode != Integer.MIN_VALUE) {
                        }
                    } else {
                        i12 = this.f33260k;
                        i13 = this.f33261l;
                        if (mode2 == Integer.MIN_VALUE) {
                            i14 = i12;
                            size2 = i13;
                        } else {
                            i14 = i12;
                            size2 = i13;
                        }
                        if (mode == Integer.MIN_VALUE) {
                            defaultSize2 = (i13 * size) / i12;
                            defaultSize = size;
                        }
                    }
                    defaultSize = i14;
                    defaultSize2 = size2;
                }
            }
        }
        setMeasuredDimension(defaultSize, defaultSize2);
        C2161Nu c2161Nu = this.f33263v;
        if (c2161Nu != null) {
            c2161Nu.b(defaultSize, defaultSize2);
        }
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        AbstractC0786o0.k("AdMediaPlayerView prepared");
        H(2);
        this.f33253d.b();
        K4.F0.f2598l.post(new RunnableC3791hu(this, mediaPlayer));
        this.f33260k = mediaPlayer.getVideoWidth();
        this.f33261l = mediaPlayer.getVideoHeight();
        int i10 = this.f33248G;
        if (i10 != 0) {
            q(i10);
        }
        if (this.f33254e && E() && this.f33258i.getCurrentPosition() > 0 && this.f33257h != 3) {
            AbstractC0786o0.k("AdMediaPlayerView nudging MediaPlayer");
            G(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.f33258i.start();
            int currentPosition = this.f33258i.getCurrentPosition();
            long jCurrentTimeMillis = G4.t.o().currentTimeMillis();
            while (E() && this.f33258i.getCurrentPosition() == currentPosition && G4.t.o().currentTimeMillis() - jCurrentTimeMillis <= 250) {
            }
            this.f33258i.pause();
            a();
        }
        int i11 = this.f33260k;
        int i12 = this.f33261l;
        StringBuilder sb = new StringBuilder(String.valueOf(i11).length() + 40 + String.valueOf(i12).length());
        sb.append("AdMediaPlayerView stream dimensions: ");
        sb.append(i11);
        sb.append(" x ");
        sb.append(i12);
        L4.p.e(sb.toString());
        if (this.f33257h == 3) {
            m();
        }
        a();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        AbstractC0786o0.k("AdMediaPlayerView surface created");
        A();
        K4.F0.f2598l.post(new RunnableC4293lu(this));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        AbstractC0786o0.k("AdMediaPlayerView surface destroyed");
        MediaPlayer mediaPlayer = this.f33258i;
        if (mediaPlayer != null && this.f33248G == 0) {
            this.f33248G = mediaPlayer.getCurrentPosition();
        }
        C2161Nu c2161Nu = this.f33263v;
        if (c2161Nu != null) {
            c2161Nu.c();
        }
        K4.F0.f2598l.post(new RunnableC4545nu(this));
        D(true);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        AbstractC0786o0.k("AdMediaPlayerView surface changed");
        int i12 = this.f33257h;
        boolean z9 = false;
        if (this.f33260k == i10 && this.f33261l == i11) {
            z9 = true;
        }
        if (this.f33258i != null && i12 == 3 && z9) {
            int i13 = this.f33248G;
            if (i13 != 0) {
                q(i13);
            }
            m();
        }
        C2161Nu c2161Nu = this.f33263v;
        if (c2161Nu != null) {
            c2161Nu.b(i10, i11);
        }
        K4.F0.f2598l.post(new RunnableC4419mu(this, i10, i11));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f33253d.d(this);
        this.f33937a.b(surfaceTexture, this.f33249H);
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i10, int i11) {
        StringBuilder sb = new StringBuilder(String.valueOf(i10).length() + 35 + String.valueOf(i11).length());
        sb.append("AdMediaPlayerView size changed: ");
        sb.append(i10);
        sb.append(" x ");
        sb.append(i11);
        AbstractC0786o0.k(sb.toString());
        this.f33260k = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        this.f33261l = videoHeight;
        if (this.f33260k == 0 || videoHeight == 0) {
            return;
        }
        requestLayout();
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(final int i10) {
        StringBuilder sb = new StringBuilder(String.valueOf(i10).length() + 47);
        sb.append("AdMediaPlayerView window visibility changed to ");
        sb.append(i10);
        AbstractC0786o0.k(sb.toString());
        K4.F0.f2598l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.qu
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f32747a.I(i10);
            }
        });
        super.onWindowVisibilityChanged(i10);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5426uu
    public final int p() {
        if (E()) {
            return this.f33258i.getCurrentPosition();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5426uu
    public final void q(int i10) {
        StringBuilder sb = new StringBuilder(String.valueOf(i10).length() + 23);
        sb.append("AdMediaPlayerView seek ");
        sb.append(i10);
        AbstractC0786o0.k(sb.toString());
        if (!E()) {
            this.f33248G = i10;
        } else {
            this.f33258i.seekTo(i10);
            this.f33248G = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5426uu
    public final void r(float f10, float f11) {
        C2161Nu c2161Nu = this.f33263v;
        if (c2161Nu != null) {
            c2161Nu.e(f10, f11);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5426uu
    public final int s() {
        MediaPlayer mediaPlayer = this.f33258i;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5426uu
    public final int t() {
        MediaPlayer mediaPlayer = this.f33258i;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    @Override // android.view.View
    public final String toString() {
        String name = TextureViewSurfaceTextureListenerC5174su.class.getName();
        String hexString = Integer.toHexString(hashCode());
        StringBuilder sb = new StringBuilder(name.length() + 1 + String.valueOf(hexString).length());
        sb.append(name);
        sb.append("@");
        sb.append(hexString);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5426uu
    public final long u() {
        if (this.f33251J != null) {
            return (w() * ((long) this.f33262m)) / 100;
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5426uu
    public final long v() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5426uu
    public final long w() {
        if (this.f33251J != null) {
            return ((long) o()) * ((long) this.f33251J.intValue());
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5426uu
    public final int x() {
        if (Build.VERSION.SDK_INT < 26 || !E()) {
            return -1;
        }
        return this.f33258i.getMetrics().getInt("android.media.mediaplayer.dropped");
    }
}
