FROM ubuntu:trusty as builder
LABEL maintainer="pejman@ghorbanzade.com"
LABEL stage=intermediate
ENV DEBIAN_FRONTEND noninteractive

RUN apt-get update \
  && apt-get install -y --no-install-recommends \
    ant ghostscript latex-beamer lmodern make openjdk-7-jdk python-pygments \
    texlive-fonts-recommended texlive-latex-base texlive-latex-extra \
    texlive-xetex zip \
  # we won't ever need lists
  && rm -rf /var/lib/apt/lists/*

RUN groupadd -r pejman && useradd -m -u 8002 --no-log-init -r -g pejman pejman

COPY . /opt/

RUN chown -R pejman:pejman /opt
USER pejman

RUN make -C /opt

# ---- stager ---

FROM alpine:3.8 as stager
RUN apk add --no-cache bash
COPY --from=builder /opt /opt
RUN bash /opt/cfg/build.sh stage

# ---- production ---

FROM alpine:3.8
COPY --from=stager /opt/bin/tmp /opt/bin
