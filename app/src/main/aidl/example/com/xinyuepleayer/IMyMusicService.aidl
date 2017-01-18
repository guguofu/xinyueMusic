// IMyMusicService.aidl
package example.com.xinyuepleayer;

// Declare any non-default types here with import statements

interface IMyMusicService {


   /**
       * 根据对应的位置打开音频文件
       *
       * @param position 位置
       */
      void openAudio(int position);

      /**
       * 播放音乐
       */
       void start();

      /**
       * 暂停音乐
       */
        void pause();

      /**
       * 停止音乐
       */
       void stop();

      /**
       * 下一首
       */
       void next();

      /**
       * 上一首
       */
       void pre();

      /**
       * 得到当前进度
       */
       int getCurrentProgress();

      /**
       * 得到歌曲时长
       */
       int getDuration();

      /**
       * 得到歌曲名称
       */
       String getName();

      /**
       * 得到演唱者
       */
       String getArtist();

      /**
       * 得到歌曲路径
       */
       String getMusicPath();

      /**
       * 播放模式
       */
       void setPlayerMode(int mode);

      /**
       * 播放模式
       */
       int getPlayerMode();

        /**
         * 判断歌曲是否正在播放
        */
       boolean isPlaying();

}