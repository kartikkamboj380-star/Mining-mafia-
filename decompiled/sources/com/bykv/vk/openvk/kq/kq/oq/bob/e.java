package com.bykv.vk.openvk.kq.kq.oq.bob;

import android.content.Context;
import android.media.MediaPlayer;
import android.media.PlaybackParams;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.unity3d.services.UnityAdsConstants;
import java.io.FileDescriptor;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public class e extends c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final MediaPlayer f13388i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final a f13389j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private J1.a f13390k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Surface f13391l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Object f13392m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private volatile boolean f13393n;

    private static class a implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnSeekCompleteListener, MediaPlayer.OnVideoSizeChangedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference f13394a;

        public a(e eVar) {
            this.f13394a = new WeakReference(eVar);
        }

        @Override // android.media.MediaPlayer.OnBufferingUpdateListener
        public void onBufferingUpdate(MediaPlayer mediaPlayer, int i10) {
            try {
                e eVar = (e) this.f13394a.get();
                if (eVar != null) {
                    eVar.o(i10);
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            try {
                e eVar = (e) this.f13394a.get();
                if (eVar != null) {
                    eVar.l();
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
            try {
                e eVar = (e) this.f13394a.get();
                return eVar != null && eVar.q(i10, i11);
            } catch (Throwable unused) {
                return false;
            }
        }

        @Override // android.media.MediaPlayer.OnInfoListener
        public boolean onInfo(MediaPlayer mediaPlayer, int i10, int i11) {
            try {
                e eVar = (e) this.f13394a.get();
                return eVar != null && eVar.s(i10, i11);
            } catch (Throwable unused) {
                return false;
            }
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            try {
                e eVar = (e) this.f13394a.get();
                if (eVar != null) {
                    eVar.r();
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.media.MediaPlayer.OnSeekCompleteListener
        public void onSeekComplete(MediaPlayer mediaPlayer) {
            try {
                e eVar = (e) this.f13394a.get();
                if (eVar != null) {
                    eVar.m();
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i10, int i11) {
            try {
                e eVar = (e) this.f13394a.get();
                if (eVar != null) {
                    eVar.p(i10, i11, 1, 1);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public e() {
        MediaPlayer mediaPlayer;
        Object obj = new Object();
        this.f13392m = obj;
        synchronized (obj) {
            mediaPlayer = new MediaPlayer();
            this.f13388i = mediaPlayer;
        }
        t(mediaPlayer);
        try {
            mediaPlayer.setAudioStreamType(3);
        } catch (Throwable unused) {
        }
        this.f13389j = new a(this);
        v();
    }

    private void t(MediaPlayer mediaPlayer) {
        if (Build.VERSION.SDK_INT >= 28) {
            return;
        }
        try {
            Class<?> cls = Class.forName("android.media.MediaTimeProvider");
            Class<?> cls2 = Class.forName("android.media.SubtitleController");
            Class<?> cls3 = Class.forName("android.media.SubtitleController$Anchor");
            Object objNewInstance = cls2.getConstructor(Context.class, cls, Class.forName("android.media.SubtitleController$Listener")).newInstance(A1.a.d(), null, null);
            Field declaredField = cls2.getDeclaredField("mHandler");
            declaredField.setAccessible(true);
            try {
                declaredField.set(objNewInstance, new Handler());
                declaredField.setAccessible(false);
                mediaPlayer.getClass().getMethod("setSubtitleAnchor", cls2, cls3).invoke(mediaPlayer, objNewInstance, null);
            } catch (Throwable unused) {
                declaredField.setAccessible(false);
            }
        } catch (Throwable unused2) {
        }
    }

    private void u() {
        J1.a aVar = this.f13390k;
        if (aVar != null) {
            try {
                aVar.close();
            } catch (Throwable unused) {
            }
            this.f13390k = null;
        }
    }

    private void v() {
        this.f13388i.setOnPreparedListener(this.f13389j);
        this.f13388i.setOnBufferingUpdateListener(this.f13389j);
        this.f13388i.setOnCompletionListener(this.f13389j);
        this.f13388i.setOnSeekCompleteListener(this.f13389j);
        this.f13388i.setOnVideoSizeChangedListener(this.f13389j);
        this.f13388i.setOnErrorListener(this.f13389j);
        this.f13388i.setOnInfoListener(this.f13389j);
    }

    private void w() {
        try {
            Surface surface = this.f13391l;
            if (surface != null) {
                surface.release();
                this.f13391l = null;
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bykv.vk.openvk.kq.kq.oq.bob.a
    public void c(boolean z9) {
        this.f13388i.setLooping(z9);
    }

    @Override // com.bykv.vk.openvk.kq.kq.oq.bob.a
    public PlaybackParams csi() {
        return this.f13388i.getPlaybackParams();
    }

    @Override // com.bykv.vk.openvk.kq.kq.oq.bob.a
    public void dgq() {
        MediaPlayer mediaPlayer = this.f13388i;
        if (mediaPlayer != null) {
            mediaPlayer.prepareAsync();
        }
    }

    @Override // com.bykv.vk.openvk.kq.kq.oq.bob.a
    public void e(FileDescriptor fileDescriptor) throws IOException {
        this.f13388i.setDataSource(fileDescriptor);
    }

    protected void finalize() throws Throwable {
        super.finalize();
        w();
    }

    @Override // com.bykv.vk.openvk.kq.kq.oq.bob.a
    public void fou(boolean z9) {
        MediaPlayer mediaPlayer = this.f13388i;
        if (mediaPlayer == null) {
            return;
        }
        if (z9) {
            mediaPlayer.setVolume(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } else {
            mediaPlayer.setVolume(1.0f, 1.0f);
        }
    }

    @Override // com.bykv.vk.openvk.kq.kq.oq.bob.a
    public void i(A1.c cVar) {
        this.f13388i.setPlaybackParams(this.f13388i.getPlaybackParams().setSpeed(cVar.a()));
    }

    @Override // com.bykv.vk.openvk.kq.kq.oq.bob.a
    public void k(Surface surface) {
        w();
        this.f13391l = surface;
        this.f13388i.setSurface(surface);
    }

    @Override // com.bykv.vk.openvk.kq.kq.oq.bob.a
    public void kq(SurfaceHolder surfaceHolder) {
        synchronized (this.f13392m) {
            try {
                if (!this.f13393n && surfaceHolder != null && surfaceHolder.getSurface() != null && this.f13387h) {
                    this.f13388i.setDisplay(surfaceHolder);
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.bykv.vk.openvk.kq.kq.oq.bob.a
    public long nn() {
        try {
            return this.f13388i.getCurrentPosition();
        } catch (Throwable unused) {
            return 0L;
        }
    }

    @Override // com.bykv.vk.openvk.kq.kq.oq.bob.a
    public int nze() {
        MediaPlayer mediaPlayer = this.f13388i;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    @Override // com.bykv.vk.openvk.kq.kq.oq.bob.a
    public void oq(boolean z9) {
        this.f13388i.setScreenOnWhilePlaying(z9);
    }

    @Override // com.bykv.vk.openvk.kq.kq.oq.bob.a
    public void rhi() {
        this.f13388i.start();
    }

    @Override // com.bykv.vk.openvk.kq.kq.oq.bob.a
    public void rjo() {
        this.f13388i.stop();
    }

    @Override // com.bykv.vk.openvk.kq.kq.oq.bob.a
    public int suf() {
        MediaPlayer mediaPlayer = this.f13388i;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    @Override // com.bykv.vk.openvk.kq.kq.oq.bob.a
    public void syt() {
        this.f13388i.pause();
    }

    @Override // com.bykv.vk.openvk.kq.kq.oq.bob.a
    public long ubx() {
        try {
            return this.f13388i.getDuration();
        } catch (Throwable unused) {
            return 0L;
        }
    }

    @Override // com.bykv.vk.openvk.kq.kq.oq.bob.a
    public void vvw() {
        synchronized (this.f13392m) {
            try {
                if (!this.f13393n) {
                    this.f13388i.release();
                    this.f13393n = true;
                    w();
                    u();
                    n();
                    v();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bykv.vk.openvk.kq.kq.oq.bob.a
    public void wki() {
        try {
            this.f13388i.reset();
        } catch (Throwable unused) {
        }
        u();
        n();
        v();
    }

    @Override // com.bykv.vk.openvk.kq.kq.oq.bob.a
    public void kq(String str) throws IOException {
        Uri uri = Uri.parse(str);
        String scheme = uri.getScheme();
        if (!TextUtils.isEmpty(scheme) && scheme.equalsIgnoreCase("file")) {
            this.f13388i.setDataSource(uri.getPath());
        } else {
            this.f13388i.setDataSource(str);
        }
    }

    @Override // com.bykv.vk.openvk.kq.kq.oq.bob.a
    public synchronized void kq(com.bykv.vk.openvk.kq.kq.kq.bob.a aVar) {
        this.f13390k = J1.a.a(A1.a.d(), aVar);
        L1.a.b(aVar);
        this.f13388i.setDataSource(this.f13390k);
    }

    @Override // com.bykv.vk.openvk.kq.kq.oq.bob.a
    public void kq(long j10, int i10) {
        if (Build.VERSION.SDK_INT < 26) {
            this.f13388i.seekTo((int) j10);
            return;
        }
        if (i10 == 0) {
            this.f13388i.seekTo((int) j10, 0);
            return;
        }
        if (i10 == 1) {
            this.f13388i.seekTo((int) j10, 1);
            return;
        }
        if (i10 == 2) {
            this.f13388i.seekTo((int) j10, 2);
        } else if (i10 == 3) {
            this.f13388i.seekTo((int) j10, 3);
        } else {
            this.f13388i.seekTo((int) j10);
        }
    }
}
