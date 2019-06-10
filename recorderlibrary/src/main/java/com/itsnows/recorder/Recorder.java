package com.itsnows.recorder;

import android.media.AudioFormat;
import android.media.MediaRecorder;

/**
 * Author: itsnows
 * E-mail: xue.com.fei@outlook.com
 * CreatedTime: 19-6-10 下午12:48
 * <p>
 * Recorder
 */
public class Recorder {
    private static final int CHANNEL_CONFIG = AudioFormat.CHANNEL_OUT_MONO;
    private static final int AUDIO_FORMAT = AudioFormat.ENCODING_PCM_16BIT;
    private static final int AUDIO_SOURCE = MediaRecorder.AudioSource.MIC;
    private static final int FREQUENCY_HZ = 11025;

    private OnRecordCompleteListener mOnRecordCompleteListener;
    private OnRecordProgressListener mOnRecordProgressListener;

    /**
     * 开始录音
     */
    private void start() {

    }

    /**
     * 暂停录音
     */
    private void pasue() {

    }

    /**
     * 继续录音
     */
    private void resume() {

    }

    /**
     * 停止录音
     */
    private void stop() {

    }

    public void setOnRecordCompleteListener(OnRecordCompleteListener onRecordCompleteListener) {
        this.mOnRecordCompleteListener = onRecordCompleteListener;
    }

    public void setOnRecordProgressListener(OnRecordProgressListener onRecordProgressListener) {
        this.mOnRecordProgressListener = onRecordProgressListener;
    }

    public interface OnRecordCompleteListener {

        void onComplete(Recorder recorder);
    }

    public interface OnRecordProgressListener {

        void onProgress(Recorder recorder, long duration);

    }


}
